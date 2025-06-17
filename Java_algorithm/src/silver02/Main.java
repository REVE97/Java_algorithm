package silver02;

// p.1927
// 우선순위 큐

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        // PriorityQueue 사용

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PriorityQueue<Integer> pq = new PriorityQueue<>(); // 우선순위 큐 생성
        StringBuilder sb = new StringBuilder(); // 결과값

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                if (pq.isEmpty()) {
                    sb.append("0\n");
                } else {
                    sb.append(pq.poll()).append("\n");
                }
            } else pq.add(num);
        }
        System.out.println(sb);
    }
}*/

// p.10799
// 스택


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> stack = new Stack<>();
        int count = 0; // 잘려진 조각 개수

        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else {
                stack.pop(); // 일단 여는 괄호 하나 제거

                if (s.charAt(i - 1) == '(') {
                    // 레이저인 경우
                    count += stack.size(); // 현재 열려 있는 막대기 수만큼 조각 추가
                } else {
                    // 쇠막대기 끝인 경우
                    count += 1; // 막대기 하나 끝났으므로 조각 하나 추가
                }
            }
        }
        System.out.println(count);
    }
}
