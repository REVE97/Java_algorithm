//solved.ac_class02
/*FeedBack

//2024.12.05
//1. Array 메소드 공부 필요
//배열을 오름차순으로 정렬할때 : Arrays.sort(), 내림차순으로 정렬할때: Arrays.sort(배열명, Collections.reverseOrder())
//단 Collections.reverseOrder()을 사용할 때 int[]가 아닌 Integer[]처럼 클래스로 객체가 선언해야함. (원시타입 사용 x)
//String 은 상관없음
//2. 문제의 조건 자세히 나누기 필요
//3. boolean 변수 공부 필요
//4. 형변환 조심

//2024.12.09
//1. 함수 선언 공부 필요 : public static 데이터형식 함수명(매개변수(parameter))으로 선언
//2. 메소드 사용법 공부 필요 : 함수명(매개변수); 로 사용
//3. 배열 정렬법 공부 필요

*/

package class02; //패키지 선언

/*p.4153

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()); //밑변
            int b = Integer.parseInt(st.nextToken()); //높이
            int c = Integer.parseInt(st.nextToken()); //대각선

            if(a==0&&b==0&&c==0){ //0 0 0 입력시 종료
                break;
            }
            
            //c를 가장 긴 변으로 설정
            int[] sides = {a, b, c};
            Arrays.sort(sides);

            if (sides[2] * sides[2] == sides[0] * sides[0] + sides[1] * sides[1]) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}
*/

/*p.1978

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int arr[] = new int[N];
        int count = 0; //소수의 개수

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0;i<N;i++){
            arr[i]= Integer.parseInt(st.nextToken());
        }

        //소수 조건 1과 자기자신만이 약수가 되는 수 (나머지가 0 이어야함)
        for(int i=0;i<arr.length;i++){

            boolean isPrime = true;

            if(arr[i]==1){
                continue;
            }

            for(int j=2;j<arr[i];j++){
                if(arr[i]%j==0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                count++;
            }
        }
        System.out.print(count);
    }
}*/

/*p.1546
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //시험 과목수
        int arr[] = new int[N]; //과목 점수 배열
        int max=0; //과목 최고점
        float sum=0;
        float average=0; //평균값

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        //최고값 구하기
        for(int i=0;i<N;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        //조작점수 구하기
        for(int i=0;i<N;i++){
            sum+=(float)arr[i]/max*100;
        }

        average=(float)sum/N;
        System.out.println(average);
    }
}*/

/*p.2231

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M =0; //출력 생성자

        //생성자 구하기
        for (int i = 0; i < N; i++) {
            int sum = i; // 생성자 후보 i
            int temp = i;

            // 각 자리수 합 계산
            while (temp > 0) {
                sum += temp % 10; // 각 자리수 더하기
                temp /= 10; // 자리수를 줄임
            }

            // 분해합이 N이면 생성자를 찾음
            if (sum == N) {
                M = i;
                break;
            }
        }
        System.out.print(M);
    }
}*/

/*p.10989

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];

        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr); //오름차순 정렬

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            sb.append(arr[i]).append("\n");
        }
        System.out.print(sb);
    }
}*/

/*p.2869(달팽이 문제)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        double A = Integer.parseInt(st.nextToken()); //올라가는 길이
        double B = Integer.parseInt(st.nextToken()); //내려오는 길이
        double V = Integer.parseInt(st.nextToken()); //나무 높이

        double day = (V-B)/(A-B);

        System.out.print((int)Math.ceil(day));
    }
}*/

/*p.30802

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //참가자의 수
        int N = Integer.parseInt(br.readLine());

        int arr[] = new int[6];

        // 사이즈별 티셔츠 신청자 수
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //티셔츠 묶음, 펜 묶음
        StringTokenizer sk = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(sk.nextToken());
        int P = Integer.parseInt(sk.nextToken());

        //출력 결과
        //첫번째 줄에 티셔츠를 T장씩 최소 몇 묶음 주문해야 하는지 출력
        //두번째 줄에 펜 P자루 씩 최대 몇 묶음 주문할 수 있는지, 그때 펜을 한 자루씩 몇개 주문하는지 출력
        //조건: 티셔츠는 남아도 되지만 부족해서는 안되고 펜은 남거나 부족하지 않고 정확히 참가자 수 만큼 준비

        int T_count=0; // 주문해야할 티셔츠 묶음 수
        for(int i=0;i<arr.length;i++){
            if((arr[i]%T)!=0){
                T_count+=arr[i]/T;
                T_count+=1;
            } else if((arr[i]%T)==0){
                T_count+=arr[i]/T;
            }
        }

        System.out.println(T_count); // 첫번째 줄 출력값
        System.out.print(N/P+" "+N%P); // 두번째 줄 출력값
    }
}*/

/*p.2609

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken()); //첫번째 자연수
        int num2 = Integer.parseInt(st.nextToken()); //두번째 자연수

        int max = 1; //최대 공약수
        int min; //최소 공배수

        //최대 공약수 구하기
        for(int i=1;i<=Math.max(num1,num2);i++){
            if((num1%i==0)&&(num2%i==0)){
                max=i;
            }
        }
        
        //최소 공배수 구하기
        min=(num1*num2) / max;

        System.out.println(max);
        System.out.println(min);
    }
}*/

/*p.2798

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //카드의 개수
        int M = Integer.parseInt(st.nextToken()); //숫자들의 최대합

        int arr[] = new int[N];
        int result = 0; //3개의 카드 합의 최대값

        //N개의 카드 수
        StringTokenizer sk = new StringTokenizer(br.readLine());
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(sk.nextToken());
        }
        
        //블랙잭 조건 완전 탐색 알고리즘
        for(int i=0;i<N-2;i++){
            for(int j=i+1;j<N-1;j++){
                for(int k=j+1;k<N;k++){
                    int temp=arr[i]+arr[j]+arr[k];

                    if(M == temp){
                        result=temp;
                    }

                    if((result<temp)&&(temp<M)){
                        result=temp;
                    }
                }
            }
        }
        System.out.println(result);
    }
}*/

/*p.1259

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String S = br.readLine();
            StringBuilder sb = new StringBuilder(S);
            String reverse = sb.reverse().toString();

            if (S.equals("0")){
                break;
            }
            if (S.equals(reverse)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}*/

/*p.11050

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        System.out.println(factorial(N)/(factorial(N-K)*factorial(K)));
    }
    static int factorial(int N){
        if(N==0){
            return 1;
        }
        return N * factorial(N-1);
    }
}*/

/*p.2751

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 수의 개수
        int[] arr = new int[N];

        for(int i=0;i<N;i++){
            arr[i]= Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for(int i=0;i<N;i++){
            System.out.println(arr[i]);
        }
    }
}*/

/*p.2292

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 테스트 방 번호

        //N:1 count:1 range: 1개
        //N:2~7 count:2 range:6개
        //N:8~19 count:3 range:12개 ~

        //최종적으로 N에 맞는 count 출력
        
        int count=1; //방 개수
        int range=2; //방 번호 범위의 최솟값

        if(N==1){
            System.out.println(1);
        } else {
            while(range<=N){
                range=range+(6*count); //다음 테두리의 최대 범위 계산
                count++; //다음 테두리로 이동
            }
            System.out.println(count);
        }
    }
}*/

//p.2775

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); //테스트 테이스 횟수

        for(int t=0;t<T;t++) {
            int k = Integer.parseInt(br.readLine()); //층수
            int n = Integer.parseInt(br.readLine()); //호수

            int[][] apt = new int[k+1][n+1]; //아파트 2차원 배열

            //0층 사람 채우기
            for(int i=1;i<=n;i++){
                apt[0][i]=i;
            }
            
            //1층부터 아파트 사람 수 계산
            for(int i=1;i<=k;i++){
                for(int j=1;j<=n;j++){
                    apt[i][j] = apt[i-1][j] + apt[i][j-1]; //점화식 사용
                }
            }
            System.out.println(apt[k][n]);
        }
    }
}
