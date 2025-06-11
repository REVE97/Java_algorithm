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

import java.io.BufferedReader;
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
}
