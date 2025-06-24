package silver04;

// p.1158
// 큐

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 사람의 수
        int K = Integer.parseInt(st.nextToken()); // 제거할 사람의 수

        StringBuilder sb = new StringBuilder(); // 결과값

        Queue<Integer> q = new ArrayDeque<>();

        for (int i = 1; i <=N; i++) {
            q.add(i);
        }

        for (int i = 0; i < N; i++) {
            for (int j = 1; j < K; j++) {
                q.add(q.poll());
            }
            sb.append(q.poll());
            if (!q.isEmpty()) {
                sb.append(", ");
            }
        }

        System.out.println("<"+sb+">");
    }
}*/

// p.10866
// Deque

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 테스트케이스 수

        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            switch (s) {
                case "push_front" :
                    deque.push(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back" :
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front" :
                    if (!deque.isEmpty()) {
                        sb.append(deque.pop()+"\n");
                    } else sb.append(-1+"\n");
                    break;
                case "pop_back" :
                    if (!deque.isEmpty()) {
                        sb.append(deque.pollLast()+"\n");
                    } else sb.append(-1+"\n");
                    break;
                case "size" :
                    sb.append(deque.size()+"\n");
                    break;
                case "empty" :
                    if (deque.isEmpty()) {
                        sb.append(1+"\n");
                    } else sb.append(0+"\n");
                    break;
                case "front" :
                    if (!deque.isEmpty()) {
                        sb.append(deque.peek() + "\n");
                    } else sb.append(-1+"\n");
                    break;
                case "back" :
                    if (!deque.isEmpty()) {
                        sb.append(deque.peekLast() + "\n");
                    } else sb.append(-1+"\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}*/

// p.18258
// 큐

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 테스트케이스 수

        Deque<Integer> deque = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder(); // 결과값 출력

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            switch (s) {
                case "push" :
                    deque.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case "pop" :
                    if (!deque.isEmpty()) {
                        sb.append(deque.removeFirst()+"\n");
                    } else sb.append("-1"+"\n");
                    break;
                case "size" :
                    sb.append(deque.size()+"\n");
                    break;
                case "empty" :
                    sb.append(deque.isEmpty() ? "1"+"\n" : "0"+"\n");
                    break;
                case "front" :
                    if (!deque.isEmpty()) {
                        sb.append(deque.peekFirst()+"\n");
                    } else sb.append("-1"+"\n");
                    break;
                case "back" :
                    if (!deque.isEmpty()) {
                        sb.append(deque.peekLast()+"\n");
                    } else sb.append("-1"+"\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}*/

// p.14425

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int count = 0;

        Set<String> set1 = new HashSet<>();

        for (int i = 0; i < N; i++) {
            set1.add(br.readLine());
        }

        for (int i = 0; i < M; i++) {
            if (set1.contains(br.readLine())) {
                count++;
            }
        }

        System.out.println(count);
    }
}*/

// p.28278
// 스택

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<Integer>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());

            switch (num) {
                case 1:
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    if(!stack.isEmpty()){
                        sb.append(stack.pop()).append("\n");
                    } else sb.append(-1).append("\n");
                    break;
                case 3:
                    sb.append(stack.size()).append("\n");
                    break;
                case 4:
                    if(!stack.isEmpty()){
                        sb.append(0).append("\n");
                    } else sb.append(1).append("\n");
                    break;
                case 5:
                    if(!stack.isEmpty()){
                        sb.append(stack.peek()).append("\n");
                    } else sb.append(-1).append("\n");
                    break;
            }
        }
        System.out.println(sb.toString());
    }
}*/

// p.1302
// 집합, 맵

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 책의 개수

        Map<String,Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            set.add(s);

            if(map.containsKey(s)){
                map.put(s,map.get(s)+1);
            } else {
                map.put(s,1);
            }
        }

        List<String> list = new ArrayList<>(set);
        int max = 0;

        for (String s : list) {
            max = Math.max(max,map.get(s));
        }

        List<String> list2 = new ArrayList<>();

        for (String s : list) {
            if(map.get(s) == max){
                list2.add(s);
            }
        }

        Collections.sort(list2);
        System.out.println(list2.get(0));
    }
}*/

// p.28279
// Deque

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 테스트케이스 수

        Deque<Integer> dq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());

            switch (num) {
                case 1:
                    dq.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    dq.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case 3:
                    if(!dq.isEmpty()){
                        sb.append(dq.removeFirst()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
                case 4:
                    if(!dq.isEmpty()){
                        sb.append(dq.removeLast()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
                case 5:
                    sb.append(dq.size()).append("\n");
                    break;
                case 6:
                    if(!dq.isEmpty()){
                        sb.append(0).append("\n");
                    } else {
                        sb.append(1).append("\n");
                    }
                    break;
                case 7:
                    if(!dq.isEmpty()){
                        sb.append(dq.peekFirst()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
                case 8:
                    if(!dq.isEmpty()){
                        sb.append(dq.peekLast()).append("\n");
                    } else {
                        sb.append(-1).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb.toString());
    }
}*/

// p.1269
// 집합, 맵

// Iterator?
// iter.hashNext(), Set.contains(key) 사용

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        Set<Integer> setA = new HashSet<>(); // A 집합
        Set<Integer> setB = new HashSet<>(); // B 집합

        int A  = Integer.parseInt(st.nextToken());
        int B  = Integer.parseInt(st.nextToken());
        int count = 0; // 교집합 원소 개수
        int result = 0; // 결과값
        
        StringTokenizer stA = new StringTokenizer(br.readLine());
        StringTokenizer stB = new StringTokenizer(br.readLine());
        
        // 집합에 입력값 추가
        for(int i = 0; i < A; i++) {
            int num = Integer.parseInt(stA.nextToken());
            setA.add(num);
        }
        
        for(int i = 0; i < B; i++) {
            int num = Integer.parseInt(stB.nextToken());
            setB.add(num);
        }

        Iterator<Integer> iteratorB = setB.iterator();

        while(iteratorB.hasNext()) {
            if(setA.contains(iteratorB.next())) {
                count++;
            }
        }

        result = (setA.size()-count) + (setB.size()-count);

        System.out.println(result);
    }
}*/

// p.3986
// 스택

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 테스트 줄 개수
        int count = 0;

        for (int i = 0; i < N; i++) {
            String s = br.readLine();

            char[] chars = s.toCharArray();
            Stack<Character> stack = new Stack<>();

            for (int j = 0; j < chars.length; j++) {
                if(!stack.isEmpty() && stack.peek() == chars[j]) {
                    stack.pop();
                } else {
                    stack.push(chars[j]);
                }
            }

            if(stack.isEmpty()) count++;
        }

        System.out.println(count);
    }
}*/

// p.11652
// 맵

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Map<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            long num = Long.parseLong(br.readLine());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        long result = 0;
        int maxCount = 0;

        for (Map.Entry<Long, Integer> entry : map.entrySet()) {
            long key = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount) {
                maxCount = count;
                result = key;
            } else if (count == maxCount && key < result) {
                result = key;
            }
        }

        System.out.println(result);
    }
}*/

// p.16173
// BFS

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] graph = new int[N][N];
        boolean[][] visited = new boolean[N][N];

        // 게임판 입력 받기
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // BFS 탐색
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{0, 0});
        visited[0][0] = true;
        boolean success = false;

        while (!queue.isEmpty()) {
            int[] current = queue.remove();
            int x = current[0];
            int y = current[1];
            int jump = graph[x][y];

            // 목적지 도착
            if (x == N - 1 && y == N - 1) {
                success = true;
                break;
            }

            // 오른쪽 이동
            int ny = y + jump;
            if (ny < N && !visited[x][ny]) {
                visited[x][ny] = true;
                queue.offer(new int[]{x, ny});
            }

            // 아래쪽 이동
            int nx = x + jump;
            if (nx < N && !visited[nx][y]) {
                visited[nx][y] = true;
                queue.offer(new int[]{nx, y});
            }
        }

        // 결과 출력
        if (success) {
            System.out.println("HaruHaru");
        } else {
            System.out.println("Hing");
        }
    }
}
