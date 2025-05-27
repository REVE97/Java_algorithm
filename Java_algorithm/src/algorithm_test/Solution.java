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
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String, Integer> reportCount = new HashMap<>();
        Map<String, Set<String>> reporters = new HashMap<>();

        for (String r : new HashSet<>(Arrays.asList(report))) {
            String[] parts = r.split(" ");
            reporters.computeIfAbsent(parts[0], v -> new HashSet<>()).add(parts[1]);
            reportCount.put(parts[1], reportCount.getOrDefault(parts[1], 0) + 1);
        }

        for (int i = 0; i < id_list.length; i++) {
            Set<String> reportees = reporters.getOrDefault(id_list[i], new HashSet<>());
            for (String user : reportees)
                if (reportCount.getOrDefault(user, 0) >= k) answer[i]++;
        }

        return answer;
    }
}*/

// 3
// 전력망 둘로 나누기
// BFS

/*import java.util.*;

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < wires.length; i++) {
            // i번째 간선을 끊기
            List<List<Integer>> graph = new ArrayList<>();
            for (int j = 0; j <= n; j++) {
                graph.add(new ArrayList<>());
            }

            for (int j = 0; j < wires.length; j++) {
                if (i == j) continue; // i번째 간선은 끊는다
                int a = wires[j][0];
                int b = wires[j][1];
                graph.get(a).add(b);
                graph.get(b).add(a);
            }

            // 연결된 한 네트워크의 송전탑 개수 구하기
            int count = bfs(graph, n, wires[i][0]); // 임의의 시작점
            int diff = Math.abs(n - count - count); // 두 네트워크 차이
            answer = Math.min(answer, diff);
        }

        return answer;
    }

    private int bfs(List<List<Integer>> graph, int n, int start) {
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;
        int count = 1;

        while (!queue.isEmpty()) {
            int now = queue.poll();
            for (int next : graph.get(now)) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
                    count++;
                }
            }
        }

        return count;
    }
}*/

// 4
// 단어 변환
// BFS

/*import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        Queue<String[]> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[words.length];

        queue.add(new String[]{begin, "0"});

        while (!queue.isEmpty()) {
            String[] cur = queue.poll();
            String curWord = cur[0];
            int cnt = Integer.parseInt(cur[1]);

            if (curWord.equals(target)) return cnt;

            for (int i = 0; i < words.length; i++) {
                if (!visited[i] && getDiffCount(curWord, words[i]) == 1) {
                    visited[i] = true;
                    queue.add(new String[]{words[i], String.valueOf(cnt + 1)});
                }
            }
        }

        return 0;
    }

    int getDiffCount(String a, String b) {
        int diff = 0;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i)) diff++;
        return diff;
    }
}*/

// 5
// 게임 맵 최단거리
// BFS

import java.util.*;

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
}
