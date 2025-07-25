package silver03;

// p.1021
// Deque

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 큐의 크기
        int M = Integer.parseInt(st.nextToken()); // 뽑아낼 수의 개수

        int[] arr = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            deque.addLast(i);
        }

        int count = 0;

        for (int target : arr) {
            int index = 0;
            for (int num : deque) {
                if (num == target)
                    break;
                index++;
            }

            // 왼쪽으로 이동이 빠른 경우
            if (index <= deque.size() / 2) {
                while (deque.peekFirst() != target) {
                    deque.addLast(deque.pollFirst()); // 왼쪽으로 회전
                    count++;
                }
            } else { // 오른쪽으로 이동이 빠른 경우
                while (deque.peekFirst() != target) {
                    deque.addFirst(deque.pollLast()); // 오른쪽으로 회전
                    count++;
                }
            }
            deque.pollFirst();
        }

        System.out.println(count);
    }
}*/

// p.2346
// Deque

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] moves = new int[N]; // 각 풍선의 이동 값 저장

        Deque<Integer> dq = new ArrayDeque<>(); // 풍선 번호만 저장
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 입력 처리
        for (int i = 0; i < N; i++) {
            moves[i] = Integer.parseInt(st.nextToken());
            dq.addLast(i); // i는 0부터 시작하는 인덱스, 풍선 번호는 i+1
        }

        StringBuilder sb = new StringBuilder();

        while (!dq.isEmpty()) {
            int currentIndex = dq.pollFirst(); // 풍선 터뜨리기
            sb.append(currentIndex + 1).append(" "); // 결과에 풍선 번호(i+1) 저장

            if (dq.isEmpty()) break;

            int move = moves[currentIndex]; // 이동할 칸 수

            if (move > 0) {
                for (int i = 0; i < move - 1; i++) {
                    dq.addLast(dq.pollFirst()); // 오른쪽으로 이동
                }
            } else {
                for (int i = 0; i < -move; i++) {
                    dq.addFirst(dq.pollLast()); // 왼쪽으로 이동
                }
            }
        }

        System.out.println(sb.toString().trim());
    }
}*/

// p.2075
// 우선순위 큐

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] field = new int[N][N];
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 우선순위 큐 생성

        // 2차원 배열에 초기값 일력
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                field[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 우선순위 큐에 입력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                pq.offer(field[i][j]);
            }
        }

        for (int i = 0; i < (N*N)-N; i++) {
            pq.poll();
        }

        System.out.println(pq.peek());
    }
}*/

// p.14235
// 우선순위 큐

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 0이 들어오면 선물을 주는 곳, 0 이 아니면 거점지

        int n = Integer.parseInt(br.readLine()); // 방문 횟수
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // 우선순위 큐
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());

            if(a == 0){
                if(!pq.isEmpty()) {
                    sb.append(pq.poll()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            } else {
                for(int j = 0; j < a; j++){
                    pq.add(Integer.parseInt(st.nextToken()));
                }
            }
        }

        System.out.println(sb.toString());
    }
}*/

// p.17413
// 스택

// StringBuilder.reverse(), boolean


/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        char[] chars = S.toCharArray();
        boolean[] isTag = new boolean[chars.length];

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        // 태그 범위 표시
        boolean insideTag = false;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '<') {
                insideTag = true;
            }
            if (insideTag) {
                isTag[i] = true;
            }
            if (chars[i] == '>') {
                insideTag = false;
            }
        }


        for (int i = 0; i < chars.length; i++) {
            if (isTag[i]) {
                // 스택에 남아 있는 문자 처리 (뒤집기)
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(chars[i]); // 태그 안은 그대로
            } else {
                if (chars[i] == ' ') {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(' ');
                } else {
                    stack.push(chars[i]); // 단어는 뒤집기 위해 스택에 저장
                }
            }
        }

        // 마지막에 남은 스택 처리
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb.toString());
    }
}*/

// p.24511
// 큐, 스택, 덱

// 큐라면 0 스택이라면 1
// Deque 활용
/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder(); // 결과값

        int N = Integer.parseInt(br.readLine()); // 첫째 줄

        int[] used = new int[N]; // 큐인지 스택인지 판별
        int[] arr = new int[N]; // 덱 초기값

        StringTokenizer st = new StringTokenizer(br.readLine()); // 둘째 줄
        for (int i = 0; i < N; i++) {
            used[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine()); // 셋째 줄
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine()); // 넷째 줄
        int[] el = new int[M]; // 삽입할 원소

        st = new StringTokenizer(br.readLine()); // 다섯째 줄
        for (int i = 0; i < M; i++) {
            el[i] = Integer.parseInt(st.nextToken());
        }

        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            if (used[i] == 0) {
                dq.addFirst(arr[i]);
            }
        }

        for (int i = 0; i < M; i++) {
            dq.addLast(el[i]);
            sb.append(dq.pop()).append(" ");
        }

        System.out.println(sb.toString());
    }
}*/

// p.18115
// Deque

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 카드 개수

        int[] skills = new int[N]; // 기술 번호 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            skills[i] = Integer.parseInt(st.nextToken());
        }

        Deque<Integer> dq = new ArrayDeque<>();

        // 기술을 뒤에서부터 적용 (카드 N부터 1까지)
        for (int i = N - 1; i >= 0; i--) {
            int card = N - i; // 현재 넣을 카드 번호

            if (skills[i] == 1) {
                dq.addFirst(card);
            } else if (skills[i] == 2) {
                // 앞에서 두 번째 위치에 삽입
                int first = dq.pollFirst();
                dq.addFirst(card);
                if (first != 0) {
                    dq.addFirst(first);
                }
            } else if (skills[i] == 3) {
                dq.addLast(card);
            }
        }

        // 출력
        StringBuilder sb = new StringBuilder();
        for (int num : dq) {
            sb.append(num).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
