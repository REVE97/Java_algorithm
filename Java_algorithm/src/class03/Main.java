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
// getOrDefault 사용

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // 테스트케이스의 수
        StringBuilder sb = new StringBuilder(); // 결과값 출력

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            Map<String,Integer> map = new HashMap<>();

            for (int j = 0; j < N; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine()); // 의상의 이름 , 종류 입력
                st.nextToken(); // 의상 이름 무시
                String type = st.nextToken();

                map.put(type,map.getOrDefault(type,0)+1);
            }

            int result = 1;

            for(int count : map.values()){
                result *= (count+1);
            }

            result -= 1;

            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}*/

// p.1260
// DFS, BFS

/*import java.io.*;
import java.util.*;

public class Main {
    public static Map<Integer, List<Integer>> graph = new HashMap<>();
    public static boolean[] visited; // 방문 여부 확인

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 정점 수
        int M = Integer.parseInt(st.nextToken()); // 간선 수
        int V = Integer.parseInt(st.nextToken()); // 시작 정점

        // 그래프 초기화
        for (int i = 1; i <= N; i++) {
            graph.put(i, new ArrayList<>());
        }

        // 간선 입력
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        // 인접 리스트 정렬 (정점 번호가 작은 것부터 방문하기 위해)
        for (int key : graph.keySet()) {
            Collections.sort(graph.get(key));
        }

        visited = new boolean[N + 1];
        dfs(V);
        System.out.println();

        visited = new boolean[N + 1];
        bfs(V);
    }

    // DFS
    public static void dfs(int v) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int next : graph.getOrDefault(v, new ArrayList<>())) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    // BFS
    public static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        visited[v] = true;
        queue.offer(v);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int next : graph.getOrDefault(current, new ArrayList<>())) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.offer(next);
                }
            }
        }
    }
}*/

// p.1463
// DP

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 입력값

        // 입력값을 1로 만드는데 필요한 연산횟수 출력
        long[] dp = new long[N + 1];

        dp[1] = 0; // 1일 경우

        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1] + 1;

            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }
        System.out.println(dp[N]);
    }
}*/

// p.2579
// DP

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1칸 또는 2칸씩 이동 가능 , 연속으로 3개의 계단은 불가능
        // 마지막 도착 계단은 무조건 도착
        // 총 점수의 최댓값 출력

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 계단의 수

        int[] stair = new int[N+1]; // 계단 배열

        for (int i = 1; i <= N; i++) {
            stair[i] = Integer.parseInt(br.readLine());
        }

        // i번째 계단까지 올라왔을 때 최대점수
        int[] dp = new int[N+1];

        // 1일때일 경우
        if(N==1) {
            System.out.println(stair[1]);
            return;
        }

        // 초기값
        dp[1] = stair[1];
        dp[2] = stair[1]+stair[2];

        // 한칸 건너뛰고 올라온 경우, 두 칸 건너뛰고 두 칸 연속 밟은 경우
        for (int i = 3; i <= N; i++) {
            dp[i] = Math.max(dp[i-2], dp[i-3] + stair[i-1]) + stair[i];
        }

        System.out.println(dp[N]);
    }
}*/

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

// p.11279
// 우선순위 큐

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder(); // 결과값 출력

        int N = Integer.parseInt(br.readLine()); // 테스트케이스 수

        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(br.readLine());

            if(n==0) {
                if(pq.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(pq.poll()).append("\n");
                }
            } else {
                pq.add(n);
            }
        }
        System.out.println(sb);
    }
}*/

// p.11286
// 우선순위 큐, comparator

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 절댓값 기준 + 절댓값 같으면 음수 우선
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int absA = Math.abs(a);
                int absB = Math.abs(b);
                if (absA == absB) {
                    return a - b; // 음수 우선
                }
                return absA - absB; // 절댓값 기준 오름차순
            }
        });

        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num == 0) {
                if (pq.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(pq.poll()).append("\n");
                }
            } else {
                pq.add(num);
            }
        }
        System.out.print(sb);
    }
}*/

// p.9095
// DP

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수

        int[] dp = new int[11]; // n은 최대 10까지
        dp[0] = 1;
        dp[1] = 1; // (1)
        dp[2] = 2; // (1+1), (2)
        dp[3] = 4; // (1+1+1), (1+2), (2+1), (3)

        // dp 미리 계산
        for (int i = 4; i <= 10; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3]; // 점화식
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(dp[n]).append("\n");
        }

        System.out.print(sb);
    }
}
