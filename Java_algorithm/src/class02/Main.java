//solved.ac_class02

/*
FeedBack

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

//2024.12.12
//1. 시간초과 일때는 수학적 계산으로 풀이 생각해보기

//2024.12.16
//1. Comparable, Comparator : 인터페이스로 인터페이스 내에 선언된 메소드를 반드시 구현해야 함
//Comparable: compareTo()메소드를 오버라이딩 해야함, compareTo(T o)는 매개변수가 하나로 자기자신과 매개변수를 비교
//Comparator: compare()메소드를 오버라이딩 해야함, compare(T o1,T o2)는 매개변수가 두개로 두 매개변수를 비교
//오름차순: 반환값이 음수일때 두 원소의 위치를 변경하는 알고리즘 사용, 내림차순: 메서드 부분만 변경
//익명클래스를 사용하여 코드 간소화
//cf) https://charliezip.tistory.com/2

//2024.12.18
//1. Q. 1) 문자열 비교시에 compareTo()가 작동하는 구조, 2) Comparator 인터페이스 사용할때 compareTo()메소드를 사용해도 괜찮은가
//1) 문자열 비교시에 compareTo()메소드를 사용하면 유니코드 기준으로 정렬됨
//2) Comparator 인터페이스에서 compareTo()메소드 사용하는 것 자체는 가능함, 정렬 목적과 기준에 맞게 사용
//2. LinkedHashSet<> -> HashSet 에 순서 개념을 추가한 것, 요소들이 추가된 순서나 나중에 수정된 순서를 유지함
//+ HashSet : 가장 흔히 사용되는 Set 구현체, 중복 요소를 허용하지 않음 / TreeSet: 요소들을 오름차순으로 정렬하여 저장하는 Set 구현체

//<Set 주요 메소드>
//+ .add(): 지정된 요소를 세드에 추가, 세트에 이미 같은 요소가 있을 경우 그 요소는 추가하지 않음 / .remove(): 지정된 요소를 제거
//+ .contains(): 세트가 지정된 요소를 포함하고 있는지 여부를 반환 / .size(): 세트에 있는 요소의 수를 반환 / .isEmpty(): 비어있는지 확인

//3. String.toCharArray(): String 문자열을 char 형 배열로 바꿔서 반환해주는 메소드

//2024.12.19
//1. 알고리즘 공부 필요

//2024.12.23
//1. Char 타입 변수를 초기화 할때는 char c = '\0' 으로 초기화해야함, null 은 참조형 타입 변수에만 사용할 수 있는 값
//ex) Character c = null;

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

/*p.2775

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
}*/

/*p.11650

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); //테스트 횟수
        int arr[][] = new int[T][2];

        //좌표값 입력
        for(int i=0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0]= Integer.parseInt(st.nextToken());
            arr[i][1]= Integer.parseInt(st.nextToken());
        }
        
        //익명클래스로 Comparator 사용
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]==o2[0]){
                    return o1[1]-o2[1]; //Integer.compare(o1[1],o2[1]);
                }
                return o1[0]-o2[0]; //Integer.compare(o1[0],o2[0]);
            }
        });
        
        //출력
        for(int i=0;i<T;i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}*/

/*p.11651

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); //테스트 횟수
        int arr[][] = new int[T][2];

        //좌표값 입력
        for(int i=0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        //배열 정렬
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1]){
                    return o1[0]-o2[0];
                }
                return o1[1]-o2[1];
            }
        });

        //출력
        for(int i=0;i<T;i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}*/

/*p.10814

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine()); //테스트 횟수
        String arr[][] = new String[T][2];
        
        //정보 입력
        for(int i=0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }

        //정렬
        Arrays.sort(arr, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
            }
        });
        
        //출력
        for(int i=0;i<T;i++){
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}*/

/*p.1181

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine()); //테스트 횟수
        String[] arr = new String[T];
        
        //단어 입력
        for(int i=0;i<T;i++){
            arr[i] = br.readLine();
        }

        // 중복 제거를 위해 LinkedHashSet 사용
        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(arr));
        arr = set.toArray(new String[0]); // 중복 제거 후 배열로 변환

        //배열 정렬
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()==o2.length()){
                    return o1.compareTo(o2); //길이 같을때 사전순으로 정렬
                }
                return o1.length()-o2.length(); //길이 짧은 순서대로 정렬
            }
        });
        
        //출력
        for(String s : arr){
            System.out.println(s);
        }
    }
}*/

/*p.2839

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //배달하는 킬로그램
        int count = 0; //봉지 갯수

        //알고리즘: 3킬로그램 봉지, 5킬로그램 봉지가 있는데 최대한 5킬로그램 봉지로 배달해야 최소값 출력가능
        //정확하게 N 킬로그램 만들 수 없으면 -1  출력

        while(N>=0){
            if(N%5==0){
                count+=N/5;
                System.out.println(count);
                return;
            }
            N-=3;
            count++;
        }
        System.out.println(-1); //정확히 나눌 수 없을때 -1 출력
    }
}*/

//p.1920

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //입력
        int N = Integer.parseInt(br.readLine());
        int A[] = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        //이진탐색을 위한 A 정렬
        Arrays.sort(A);

        int M = Integer.parseInt(br.readLine());
        int B[] = new int[M];

        StringTokenizer sk = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            B[i] = Integer.parseInt(sk.nextToken());
        }
        
        //존재하는지 판단하는 조건
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            if (binarySearch(A, B[i])) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        }
        // 결과 출력
        System.out.print(sb);
    }
    
    //이진 탐색 함수
    public static boolean binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (array[mid] == target) {
                return true;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}*/

// p.1929
// 소수 구하기
/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer sk = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(sk.nextToken());
        int N = Integer.parseInt(sk.nextToken());

        for (int i = M; i <= N; i++) {
            if(isPrime(i)) {
                System.out.println(i);
            }
        }

    }

    // 소수 판별 메소드
    public static boolean isPrime(int n) {
        if(n < 2) return false;
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false; // 소수가 아님
            }
        }
        return true; // 소수
    }
}*/

// p.10828
// 스택

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] stack = new int[10001];
    static int size;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String S = st.nextToken();

            switch (S) {
                case "push" :
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop" :
                    sb.append(pop()).append("\n");
                    break;
                case "size" :
                    sb.append(size()).append("\n");
                    break;
                case "empty" :
                    sb.append(empty()).append("\n");
                    break;
                case "top" :
                    sb.append(top()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }

    public static void push(int num) {
        stack[size] = num;
        size++;
    }

    public static int pop() {
        if(size == 0) return -1;
        else {
            int P = stack[size - 1];
            size--;
            return P;
        }
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if(size == 0) return 1;
        else return 0;
    }

    public static int top() {
        if(size == 0) return -1;
        else {
            int T = stack[size - 1];
            return T;
        }
    }
}*/

// p.10845
// 큐

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] queue = new int[10001];
    static int size = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            switch (s) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(pop()).append('\n');
                    break;
                case "size":
                    sb.append(size()).append('\n');
                    break;
                case "empty":
                    sb.append(empty()).append('\n');
                    break;
                case "front":
                    sb.append(front()).append('\n');
                    break;
                case "back":
                    sb.append(back()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }

    public static void push(int num){
        queue[size] = num;
        size++;
    }

    public static int pop(){
        if(size == 0) return -1;
        else {
            int temp = queue[0];
            for(int i = 1; i < size; i++){
                queue[i-1] = queue[i];
            }
            size--;
            return temp;
        }
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        return size == 0 ? 1 : 0;
    }

    public static int front() {
        if(size == 0) return -1;
        else return queue[0];
    }

    public static int back() {
        if(size == 0) return -1;
        else return queue[size - 1];
    }
}*/

// p.1966
// 프린터 큐

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        for (int i = 0; i < T; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st1.nextToken()); // 문서 개수
            int M = Integer.parseInt(st1.nextToken()); // 목표 문서 위치

            int[] priorities = new int[N]; // 중요도 배열
            boolean[] printed = new boolean[N]; // 인쇄 여부

            // 중요도를 중요도 배열에 입력
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                priorities[j] = Integer.parseInt(st2.nextToken());
            }

            int printCount = 0; // 인쇄된 문서 수
            int currentIndex = 0; // 현재 프린터가 주목하는 문서 위치

            // 현재 문서가 아직 인쇄되지 않았을 때까지 처리
            while (true) {
                if (!printed[currentIndex]) {
                    boolean hasHigher = false;
                    // 아직 인쇄되지 않은 문서 중 현재 문서보다 중요도가 높은 문서가 있는지 검사함
                    for (int j = 0; j < N; j++) {
                        if (!printed[j] && priorities[j] > priorities[currentIndex]) {
                            hasHigher = true;
                            break;
                        }
                    }

                    if (hasHigher) {
                        // 중요도가 높은 문서가 있으므로 현재 문서를 뒤로 미룸
                        currentIndex = (currentIndex + 1) % N;
                    } else {
                        // 현재 문서 인쇄
                        printed[currentIndex] = true;
                        printCount++;

                        if (currentIndex == M) {
                            System.out.println(printCount);
                            break;
                        }

                        currentIndex = (currentIndex + 1) % N;
                    }
                } else {
                    currentIndex = (currentIndex + 1) % N;
                }
            }
        }
    }
}*/

// p.1436

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;              // 찾은 "숌의 숫자" 개수를 세는 변수
        int number = 666;           // 666부터 시작

        // 계속 숫자를 증가시키면서 검사
        while (true) {
            // 현재 숫자에 '666'이 포함되어 있다면
            if (String.valueOf(number).contains("666")) {
                count++;  // "숌의 숫자" 개수를 1 증가
                if (count == n) {   // N번째 숫자라면 출력하고 종료
                    System.out.println(number);
                    break;
                }
            }
            number++; // 다음 숫자로 이동
        }
    }
}*/

// p.9012

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            boolean flag = VPS(str);
            System.out.println(flag ? "YES" : "NO");
        }
    }

    public static boolean VPS(String s) {
        int count = 0;
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '(') {
                count++;
            } else if (c[i] == ')') {
                count--;
            }

            if (count < 0 ) return false;
        }
        return count == 0;
    }
}*/

// p.7568
// (x,y) (p,q) = x>p and y>q => 덩치가 크다
// 덩치 등수 = 자신보다 큰 덩치의 사람의 수 n+1

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 전체 사람수
        int[][] arr = new int[N][2]; // 몸무게, 키 2차원 배열
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[i][0] = a; // 몸무게
            arr[i][1] = b; // 키
        }

        for (int i = 0; i < N; i++) {
            int rank = 1; // 덩치 등수
            for (int j = 0; j < N; j++) {
                if (i==j) continue;
                if ((arr[j][0] > arr[i][0]) && (arr[j][1] > arr[i][1])) {
                    rank++;
                }
            }
            System.out.print(rank+" ");
        }
    }
}*/

// p.1018
// 2차원 배열 사용 ?

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static char[][] board;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 행
        int M = Integer.parseInt(st.nextToken()); // 열

        board = new char[N][M];

        // 보드 입력 받기
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        int min = Integer.MAX_VALUE;

        // 모든 8x8 구간 탐색
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int result = countToRepaint(i, j);
                if (result < min) {
                    min = result;
                }
            }
        }

        System.out.println(min);
    }

    // 8x8 체스판을 다시 칠해야 하는 최소 칸 수 계산
    public static int countToRepaint(int x, int y) {
        int count1 = 0; // 'W'로 시작
        int count2 = 0; // 'B'로 시작

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                // 실제 좌표
                char current = board[x + i][y + j];

                // 기대되는 색상
                if ((i + j) % 2 == 0) {
                    if (current != 'W') count1++;
                    if (current != 'B') count2++;
                } else {
                    if (current != 'B') count1++;
                    if (current != 'W') count2++;
                }
            }
        }

        return Math.min(count1, count2);
    }
}*/

// p.2164
// 큐 사용

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Queue<Integer> q = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        while(q.size() > 1) {
            q.poll();
            q.add(q.poll());
        }

        System.out.println(q.poll());
    }
}*/

// p.4949
// 스택
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();

            if (str.equals(".")) break;

            boolean flag = isBalanced(str);

            System.out.println(flag ? "yes" : "no");
        }
    }

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(' || c == '[') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.peek() != '(') return false;
                stack.pop();
            } else if (c == ']') {
                if (stack.isEmpty() || stack.peek() != '[') return false;
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}*/

// p.10816
// 진행중

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 숫자 카드 개수 입력
        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 찾을 숫자 개수 입력
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st2.nextToken());
            sb.append(map.getOrDefault(target, 0)).append(" ");
        }

        // 결과 출력
        System.out.println(sb.toString().trim());
    }
}*/

// p.11866
// 큐

// 1 2 3 4 5 6 7
// 4 5 6 7 1 2
// 7 1 2 4 5
// 4 5 7 1
// 1 4 5
// 1 4

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
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        for (int i = 0; i < N; i++) {
            for (int j = 1; j < K; j++) {
                q.add(q.poll());
            }
            sb.append(q.poll());
            if(!q.isEmpty()) {
                sb.append(", ");
            }
        }
        sb.append(">");
        System.out.println(sb);
    }
}*/

// p.1874
// 스택 수열
// 진행중

// 4 3 6 8 7 5 2 1

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] sequence = new int[n];

        for (int i = 0; i < n; i++) {
            sequence[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();
        int current = 1;
        boolean isPossible = true;

        for (int i = 0; i < n; i++) {
            int target = sequence[i];

            // target보다 작거나 같을 때까지 push
            while (current <= target) {
                stack.push(current);
                sb.append("+\n");
                current++;
            }

            // 스택 top이 target이면 pop
            if (stack.peek() == target) {
                stack.pop();
                sb.append("-\n");
            } else {
                // 만들 수 없는 수열
                isPossible = false;
                break;
            }
        }

        if (isPossible) {
            System.out.print(sb);
        } else {
            System.out.println("NO");
        }
    }
}*/

// p.15829
// 해싱 함수

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        final int r = 31;
        final int M = 1234567891;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine()); // 문자열 길이
        String str = br.readLine(); // 문자열 입력

        long hash = 0;
        long power = 1;

        for (int i = 0; i < L; i++) {
            int charValue = str.charAt(i) - 'a' + 1; // 'a' = 1, 'b' = 2, ..., 'z' = 26
            hash = (hash + (charValue * power) % M) % M;
            power = (power * r) % M; // r^i mod M 갱신
        }

        System.out.println(hash);
    }
}*/

// p.28702

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // FizzBuzz 규칙에 따라 문자열을 반환하는 메서드
    private static String fizzBuzz(int n) {
        if (n % 15 == 0) return "FizzBuzz";
        else if (n % 3 == 0) return "Fizz";
        else if (n % 5 == 0) return "Buzz";
        else return String.valueOf(n);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = new String[3];
        int[] numbers = new int[3];
        boolean[] isNumber = new boolean[3];

        // 입력값 처리
        for (int i = 0; i < 3; i++) {
            inputs[i] = br.readLine();
            try {
                numbers[i] = Integer.parseInt(inputs[i]);
                isNumber[i] = true;
            } catch (NumberFormatException e) {
                isNumber[i] = false;
            }
        }

        int nextNumber = 0;

        // 세 번째 입력값이 숫자인 경우
        if (isNumber[2]) {
            nextNumber = numbers[2] + 1;
        } else if (isNumber[1]) {
            nextNumber = numbers[1] + 2;
        } else if (isNumber[0]) {
            nextNumber = numbers[0] + 3;
        } else {
            // 모든 입력값이 문자열인 경우 처리 (예외 상황)
            System.out.println("Cannot determine the next number.");
            return;
        }

        // FizzBuzz 결과 출력
        System.out.println(fizzBuzz(nextNumber));
    }
}*/

// p.10773
// 스택

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }

        int sum = 0;

        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        System.out.println(sum);
    }
}*/

// p.18110
// 정렬

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        // 의견이 없으면 난이도 0
        // 난이도는 모든 사람의 난이도 의견의 절사평균 30%으로 결정
        // 절사평균으로 제외되는 사람 수는 위 아래에서 각각 반올림
        // 마지막 난이도도 반올림하여 출력 Math.round() 사용
        // 배열 선언후 length 앞뒤로 자르고 반올림

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 난이도 의견 갯수

        int[] arr = new int[n]; // 난이도 배열
        double result = 0; // 난이도 최종값

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        // 앞뒤로 자를 배열 수
        int count = (int)Math.round(n*0.15);

        for(int i = 0+count; i < n-count; i++) {
            result += arr[i];
        }

        result /= n-count*2;
        System.out.println(Math.round(result));
    }
}*/

// p.1654

/*import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[K];
        long max = 0;

        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] > max) max = arr[i]; // 최대값 저장
        }

        long left = 1;
        long right = max;
        long result = 0;

        while (left <= right) {
            long mid = (left + right) / 2;

            long count = 0;
            for (int i = 0; i < K; i++) {
                count += arr[i] / mid;
            }

            if (count >= N) {
                result = mid; // 더 긴 길이 시도
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(result);
    }
}*/

// p.2108
// 집합, 맵

// N은 무조건 홀수값
// 산술 평균 : 평균값 구하기
// 중앙값 : 배열 정렬 후 길이 / 2 -> Math.round() 사용
// 최빈값 : 따로 배열 만들어서 max 값 구하기
// 범위 : 배열 정렬 후에 index (n-1) - 0 값 구하기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int[] count = new int[8001];

        int sum = 0;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            count[arr[i] + 4000]++;
        }

        Arrays.sort(arr);

        // 1. 산술평균
        System.out.println(Math.round((double)sum / N));

        // 2. 중앙값
        System.out.println(arr[N / 2]);

        // 3. 최빈값
        int maxFreq = 0;
        for (int i = 0; i < 8001; i++) {
            if (count[i] > maxFreq) {
                maxFreq = count[i];
            }
        }

        List<Integer> modeList = new ArrayList<>();
        for (int i = 0; i < 8001; i++) {
            if (count[i] == maxFreq) {
                modeList.add(i - 4000);
            }
        }

        // 최빈값 출력: 두 번째로 작은 값
        if (modeList.size() > 1) {
            Collections.sort(modeList);
            System.out.println(modeList.get(1));
        } else {
            System.out.println(modeList.get(0));
        }

        // 4. 범위
        System.out.println(arr[N - 1] - arr[0]);
    }
}
