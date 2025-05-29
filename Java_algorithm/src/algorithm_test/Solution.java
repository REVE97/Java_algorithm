package algorithm_test;

// 1
// 괄호 회전하기
// 스택
/*import java.util.*;

class Solution {
    public int solution(String s) {
        String sb = s + s; // 문자열을 두 번 이어붙여 회전을 쉽게 처리
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            String str = sb.substring(i, i + s.length());
            if (isValid(str)) answer++;
        }

        return answer;
    }

    private boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.peek() != '(') return false;
                stack.pop();
            } else if (c == ']') {
                if (stack.isEmpty() || stack.peek() != '[') return false;
                stack.pop();
            } else if (c == '}') {
                if (stack.isEmpty() || stack.peek() != '{') return false;
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}*/

// 2
// 신고 결과 받기
// 집합, 맵

/*import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) { //report : 신고한 이용자 문자열 배열
        int[] answer = new int[id_list.length];

        Map<String, Set<String>> reporters = new HashMap<>(); // 각 유저가 신고한 대상
        Map<String, Integer> reportCount = new HashMap<>(); // 각 유저가 신고당한 횟수

        for (String s : new HashSet<>(List.of(report))) { // 중복 신고 제거
            String[] parts = s.split(" ");
            reporters.computeIfAbsent(parts[0], v -> new HashSet<>()).add(parts[1]); // part[0]:신고자
            reportCount.put(parts[1], reportCount.getOrDefault(parts[1], 0) + 1); // part[1]:신고 대상
        }

        for (int i = 0; i < id_list.length; i++) {
            Set<String> reported = reporters.getOrDefault(id_list[i], new HashSet<>()); // 신고한 유저 목록
            for (String user : reported)
                if (reportCount.getOrDefault(user, 0) >= k)
                    answer[i]++;
        }
        return answer;
    }
}*/

// 3
// 전력망 둘로 나누기
// DFS

/*import java.util.*;

class Solution {
    int answer;
    public int solution(int n, int[][] wires) {
        answer = n;
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (int[] wire : wires) {
            graph.get(wire[0]).add(wire[1]);
            graph.get(wire[1]).add(wire[0]);
        }

        //✅ DFS 탐색을 수행하며 답을 구한다.
        boolean[] visited = new boolean[n+1];
        dfs(graph, visited, 1, n);

        return answer;
    }

    int dfs(Map<Integer, List<Integer>> graph, boolean[] visited, int cur, int n) {
        int count = 1;
        visited[cur] = true;

        for (int next : graph.get(cur)) {
            if (!visited[next]) {
                count += dfs(graph, visited, next, n);
            }
        }
        //✅ 최적값을 업데이트한다.
        answer = Math.min(answer, Math.abs(n - count * 2));

        return count;
    }
}*/

// 4
// 단어 변환
// BFS

import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        Queue<String[]> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[words.length];

        queue.add(new String[]{begin, "0"}); // 초기 상태
        
        // BFS 탐색 시작
        while (!queue.isEmpty()) {
            String[] cur = queue.poll(); // 큐에서 단어 하나 꺼냄
            String curWord = cur[0]; // 시작 단어 
            int cnt = Integer.parseInt(cur[1]); // 변환 횟수

            if (curWord.equals(target)) return cnt; // 꺼낸 단어가 target 이면 그대로 횟수 반환
            
            // 인접 단어 탐색 - 암기 필요
            for (int i = 0; i < words.length; i++) {
                if (!visited[i] && Count(curWord, words[i]) == 1) {
                    visited[i] = true; // 방문 처리
                    queue.add(new String[]{words[i], String.valueOf(cnt + 1)}); // 해당 단어를 횟수 1 추가해서 추가
                }
            }
        }
        
        // 목표 단어에 도달할 수 없는 경우 ( target 단어에 도달 x )
        return 0;
    }
    
    // 두 단어 사이의 다른 글자 개수 반환
    int Count(String a, String b) {
        int diff = 0;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i)) diff++;
        return diff;
    }
}

// 5
// 게임 맵 최단거리
// BFS

/*import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> queue = new ArrayDeque<>();

        //✅ BFS 탐색을 수행한다.
        queue.add(new int[]{ 0, 0, 1 });
        visited[0][0] = true;

        int[] dr = { 0, 1, 0, -1 };
        int[] dc = { -1, 0, 1, 0 };

        while (!queue.isEmpty()) {
            int[] cur = queue.remove();
            int r = cur[0], c = cur[1], dist = cur[2];

            //✅ 탐색 과정에서 목적지에 도달하면 거리를 반환한다.
            if (r == n - 1 && c == m - 1) {
                return dist;
            }

            for (int d = 0; d < 4; d++) {
                int nr = r + dr[d], nc = c + dc[d];

                if (nr >= 0 && nr < n && nc >= 0 && nc < m && maps[nr][nc] == 1) {
                    if (!visited[nr][nc]) {
                        visited[nr][nc] = true;
                        queue.add(new int[]{ nr, nc, dist + 1 });
                    }
                }
            }
        }
        //✅ 탐색 과정에서 목적지에 도달하지 못했다면 -1을 반환한다.
        return -1;
    }
}*/
