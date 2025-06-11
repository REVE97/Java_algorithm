package silver03;


// p.1021
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
}

