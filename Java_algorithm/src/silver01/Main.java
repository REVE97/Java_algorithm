package silver01;


// p.1932
// DP

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] triangle = new int[n][n];
        int[][] dp = new int[n][n];

        // 입력 받기
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 초기값 설정 (맨 위 꼭대기)
        dp[0][0] = triangle[0][0];

        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + triangle[i][j]; // 맨 왼쪽
                } else if (j == i) {
                    dp[i][j] = dp[i - 1][j - 1] + triangle[i][j]; // 맨 오른쪽
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + triangle[i][j]; // 중간
                }
            }
        }

        // 마지막 줄 중 최댓값 찾기
        int max = 0;
        for (int j = 0; j < n; j++) {
            if (dp[n - 1][j] > max) {
                max = dp[n - 1][j];
            }
        }

        System.out.println(max);
    }
}

