package class03;

// p.11723
// 집합 (Set)

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(br.readLine()); //테스트케이스 횟수
        Set<Integer> set = new HashSet<>(); //공집합 생성

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            int x = 0;
            if(st.hasMoreTokens()){
                x = Integer.parseInt(st.nextToken());
            }

            switch (str) {
                case "add" :
                    if (!set.contains(x)) {
                        set.add(x);
                    }
                    break;
                case "remove" :
                    if (set.contains(x)) {
                        set.remove(x);
                    }
                    break;
                case "check" :
                    if (set.contains(x)) {
                        sb.append("1\n");
                    } else {
                        sb.append("0\n");
                    }
                    break;
                case "toggle" :
                    if (set.contains(x)) {
                        set.remove(x);
                    } else {
                        set.add(x);
                    }
                    break;
                case "all" :
                    set.clear();
                    for(int j=1;j<=20;j++){
                        set.add(j);
                    }
                    break;
                case "empty" :
                    set.clear();
                    break;
            }
        }
        System.out.println(sb);
    }
}*/

// p.1764
// 집합
// 사전순으로 정렬

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> set1 = new HashSet<String>(); //N Set
        Set<String> result = new TreeSet<String>(); //result Set

        for (int i = 0; i < N; i++) {
            String str1 = br.readLine();
            set1.add(str1);
        }

        for (int i = 0; i < M; i++) {
            String str2 = br.readLine();
            if(set1.contains(str2)) {
                result.add(str2);
            }
        }
        for(String s : result) {
            sb.append(s).append("\n");
        }

        System.out.println(result.size());
        System.out.println(sb);
    }
}*/

// p.1003
// 피보나치 함수
// DP = Dynamic Programming
// f(0) = 0, f(1) = 1
// N번째 피보나치를 호출 했을 때 0,1 이 출력되는 횟수 출력

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // 테스트케이스 수

        int[][] dp = new int[41][2]; // 최대 N=40, 0: count_zero, 1: count_one

        // 초기값 설정
        dp[0][0] = 1; // fibo(0) = 0 호출 1번
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1; // fibo(1) = 1 호출 1번

        // 점화식 채우기
        for (int i = 2; i <= 40; i++) {
            dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
            dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
        }

        // 테스트케이스 실행
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            System.out.println(dp[N][0] + " " + dp[N][1]);
        }
    }
}*/

// p.11399
// 그리디 알고리즘
// 정렬
// 총 걸리는 시간의 최소값 구하기

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 사람의 수
        int[] people = new int[N]; // 걸리는 시간 배열

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            people[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(people); // 정렬

        int sum = 0;
        int prev = 0;

        for (int i = 0; i < N; i++) {
            prev += people[i]; // 누적 시간
            sum += prev; // 전체시간
        }
        System.out.println(sum);
    }
}*/

// p.11047
// 그리디 알고리즘

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 동전 가짓수
        int K = Integer.parseInt(st.nextToken()); // 총 가격

        int[] coin = new int[N]; // 코인 배열

        for (int i = 0; i < N; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }
        
        int min = 0; // 동전 개수 최솟값

        for(int i = N-1; i >= 0; i--) {
            if(coin[i] <= K) {
                min += K / coin[i];
                K = K % coin[i];
            }
        }
        System.out.println(min);
    }
}*/

// p.11659
// prefixSum[i] = arr[1] + arr[2] + ... + arr[i]
// 누적합 배열 생성

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 배열 수의 갯수
        int M = Integer.parseInt(st.nextToken()); // 테스트 케이스 횟수

        int[] arr = new int[N + 1]; // 배열 생성 
        int[] prefixSum = new int[N + 1]; // 누적합 배열 생성

        // 배열 값 초기화
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            prefixSum[i] = prefixSum[i - 1] + arr[i]; // 누적합 미리 계산
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(prefixSum[b] - prefixSum[a - 1]).append("\n");
        }

        System.out.println(sb);
    }
}*/


// p.1620
// 해시, 집합과 맵
// key 를 입력하면 value 가 나오고 value 를 입력하면 key 값이 출력

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 포켓몬 숫자
        int M = Integer.parseInt(st.nextToken()); // 문제 수

        Map<String,Integer> map = new HashMap<String,Integer>(); // 이름으로 인덱스
        String[] numTo = new String[N+1]; // 인덱스로 이름
        StringBuilder sb = new StringBuilder(); // 결과 StringBuilder

        // HashMap 값,numTo 배열 값 입력
        for(int i = 1; i <= N; i++) {
            String str = br.readLine();
            map.put(str,i);
            numTo[i] = str;
        }

        // 정수 입력과 문자열 입력을 달리 처리해야함 => 따로 메소드 구현
        for(int i = 1; i <= M; i++) {
            String str = br.readLine();
            if(isNumber(str)){
                int index = Integer.parseInt(str);
                sb.append(numTo[index]).append("\n");
            } else {
                sb.append(map.get(str)).append("\n");
            }
        }
        System.out.println(sb);
    }

    public static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}*/

// p.17219
// 해시, 집합과 맵

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 저장된 사이트 주소의 수
        int M = Integer.parseInt(st.nextToken()); // 찾으려는 사이트 주소의 수

        Map<String,String> map = new HashMap<>(); // 사이트, 비밀번호를 저장할 맵
        StringBuilder sb = new StringBuilder(); // 출력할 값

        // 맵에 key, value 값 추가
        for(int i=0;i<N;i++) {
            st = new StringTokenizer(br.readLine());
            map.put(st.nextToken(),st.nextToken());
        }

        // 비밀번호 찾으려는 사이트 입력
        for(int i=0;i<M;i++) {
            String str = br.readLine();
            sb.append(map.get(str)).append("\n");
        }
        System.out.println(sb);
    }
}*/

// p.9375
// 해시, 집합과 맵

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // 테스트케이스의 수

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            Map<String,String> map = new HashMap<>();

            for (int j = 0; j < N; j++) {
                
            }
        }
    }
}










