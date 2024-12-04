//solved.ac_class01

/*FeedBack
//2024.11.27
//1. StringTokenizer 개념 숙지, BufferedReader, Writer 개념 숙지, StringBuilder 숙지
//2. p.10871 수정필요함 (2024.11.28 수정완료)
//3. 아스키 코드 학습 필요 (2024.11.28 학습완료)

//2024.11.28
//1. 문자열에서 문자 추출 : String.charAt() 메소드 사용 ex. string 변수명.charAt(N)
//2. 문자 - 숫자 (아스키코드 변경) : 문자열 선언 후 String.charAt()으로 문자로 변경, (int)사용하여 형변환 후 출력
//아스키코드에서 숫자값을 정수로 반환할 때 에는 아스키코드 -'0'or -48 을 한다
//3. StringTokenizer : StringTokenizer(매개변수, 구분할 구분자)으로 사용 
//st.countTokens() 메소드로 현재 남아있는 토큰 갯수 확인 가능 ex.1152번 문제

//2024.12.02
//1. 10250번 문제 수정 필요

//2024.12.03
//1. HashSet 클래스 사용 공부 필요
//Hashset<변수 타입> 클래스명 = new HashSet<>()으로 사용, 중복 없는 수 찾을 때 사용(.add(), .size() 메소드 이용)
//cf) p.3052
*/
package class01; //패키지 선언

/*p.1000

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int A= sc.nextInt();
        int B= sc.nextInt();

        System.out.println(A+B);
    }
}
*/

/*p.1001
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        System.out.print(A-B);
    }
}
*/

/*p.1008
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());

        System.out.println(A/B);
    }
}
*/

/*p.2438

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/

/*p.1330
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if(A>B){
            System.out.print('>');
        } else if(A<B){
            System.out.print('<');
        } else {
            System.out.print("==");
        }
    }
}
*/

/*p.2475
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        int sum = a*a + b*b + c*c + d*d + e*e;
        int result = sum % 10;

        System.out.print(result);
    }
}
*/

/*p.2557
public class Main{
    public static void main(String[] args){
        System.out.print("Hello World!");
    }
}
*/

/*p.2739
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i=1;i<10;i++){
            System.out.println(N + " * " + i + " = " + N*i);
        }
    }
}
*/

/*p.2741

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i=1;i<=N;i++){
            System.out.println(i);
        }
    }
}*/

/*p.2753
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(br.readLine());

        if(((year%4==0)&&(year%100!=0))||(year%400==0)){
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}*/

/*p.9498

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int score = Integer.parseInt(br.readLine());

        if(score>=90){
            System.out.print('A');
        } else if(score>=80){
            System.out.print('B');
        } else if(score>=70){
            System.out.print('C');
        } else if(score>=60){
            System.out.print('D');
        } else {
            System.out.print('F');
        }
    }
}*/

/*p.10171

public class Main{
    public static void main(String[] args) {
        System.out.println("\\    /\\");
        System.out.println(" )  ( ')");
        System.out.println("(  /  )");
        System.out.println(" \\(__)|");
    }
}*/

/*p.10172

public class Main{
    public static void main(String[] args) {
        System.out.println("|\\_/|");
        System.out.println("|q p|   /}");
        System.out.println("( 0 )\"\"\"\\");
        System.out.println("|\"^\"`    |");
        System.out.println("||_/=\\\\__|");
    }
}*/

/*p.10869

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A/B);
        System.out.println(A%B);
    }
}*/

/*p.10871

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int arr[] = new int[N];

        StringTokenizer sk = new StringTokenizer(br.readLine());

        for(int i=0;i<N;i++){
            arr[i]=Integer.parseInt(sk.nextToken());
        }

        for(int j=0;j<N;j++){
            if(arr[j]<X){
                sb.append(arr[j]).append(" ");
            }
        }

        System.out.print(sb);
    }
}*/

/*p.10950
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int arr[] = new int[T];

        for(int i=0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            arr[i]= A+B;
        }

        for(int j=0;j<T;j++){
            System.out.println(arr[j]);
        }
    }
}*/

/*p.10951

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String line;

        while((line=br.readLine())!=null) {
            st = new StringTokenizer(line);
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            sb.append(A+B).append("\n");
        }
        System.out.print(sb);
    }
}*/

/*p.10952

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            if((A!=0)&&(B!=0))
                sb.append(A+B).append("\n");

            if((A==0)&&(B==0))
                break;
        }
    System.out.print(sb);
    }
}*/

/*p.10998

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        System.out.print(A*B);
    }
}*/

/*p.25083

public class Main{
    public static void main(String[] args){
        System.out.println("         ,r'\"7");
        System.out.println("r`-_   ,'  ,/");
        System.out.println(" \\. \". L_r'");
        System.out.println("   `~\\/");
        System.out.println("      |");
        System.out.println("      |");
    }
}*/

/*p.27866

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        int i = Integer.parseInt(br.readLine());

        System.out.print(S.charAt(i-1));
    }
}*/

/*p.11654
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        char c = s.charAt(0);
        int i = (int)c;

        System.out.print(i);
    }
}*/

/*p.2439

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i=1;i<=N;i++){
            for(int j=1;j<=N-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

/*p.11720

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String S = br.readLine();

        int arr[] = new int[N];
        int sum=0;

        for(int i=0;i<N;i++){
            arr[i] = S.charAt(i)-'0';
            sum+=arr[i];
        }
        System.out.print(sum);
    }
}*/

/*p.31403

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        String S="";
        S+=A;
        S+=B;
        int e = Integer.parseInt(S);

        System.out.println(A+B-C);
        System.out.print(e-C);
    }
}*/

/*p.2562 수정필요

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[9];
        int max = 0;
        int index = 0;

        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int j=0; j<arr.length; j++){
            if(max<arr[j]){
                max=arr[j];
                index=j+1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}*/

/*p.2884
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        //M에서 45뺄때 -가 되면 M+60에서 -처리하고 H에서 1빼기

        if((M-45)<0){
            H = H-1;
            M = M+60;
            M = M-45;
            if(H<0){
                H=H+24;
            }
        } else {
            M = M-45;
        }
        System.out.print(H+" "+M);
    }
}*/

/*p.10818
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.print(min+" "+max);
    }
}*/

/*p.1152
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = st.countTokens();
        System.out.print(count);
    }
}*/

/*p.2577
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int result = (A*B*C);
        
        //첫째 줄에는 0이 몇번 쓰였는지 1~9가 각각 몇 번 쓰였는지 결과 출력
        String s = String.valueOf(result); //문자열로 변경

        //중첩 반복문으로 풀기
        for(int i=0;i<10;i++){
            int count=0;
            for(int j=0;j<s.length();j++){
                if((s.charAt(j)-'0')==i){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}*/

/*p.10250 수정필요

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // T: 테스트 H: 호텔 층수 W : 호텔 방 수 N: 몇번째 손님
        int T = Integer.parseInt(br.readLine()); // 테스트 횟수
        int arr[] = new int[T]

        for(int i=0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            //무조건 W 값이 작은 순서대로 선호, 단 W 값이 같을때는 H 작은 값을 선호
            //출력값은 HHWW 값으로 출력
            //결과값 arr[i]에 저장 후 출력
            
        }

    }
}*/

/*p.2675

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); //테스트 케이스 수

        for(int i=0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken()); //반복횟수
            String S = st.nextToken(); //반복 문자열

            //String.charAt() 함수 써서 반복?
            for(int j=0;j<S.length();j++){
                for(int k=0;k<R;k++){
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
    }
}*/

/*p.2920
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int arr[] = new int[8];
        String result = "";

        for(int i=0;i<arr.length;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int j=0;j<arr.length-1;j++){
            if(arr[j+1]-arr[j]==1){
                result="ascending";
            } else if (arr[j+1]-arr[j]==-1){
                result="descending";
            } else {
                result="mixed";
                break; //이 구문 하나 땜에 틀림..
            }
        }
        System.out.print(result);
    }
}*/

/*p.3052

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<Integer> hs = new HashSet<>();

        for(int i=0;i<10;i++){
            hs.add(Integer.parseInt(br.readLine())%42);
        }

        System.out.print(hs.size());
    }
}*/

/*p.10809

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        int[] arr = new int[26]; // a~z의 위치를 저장할 배열

        // 배열을 -1로 초기화 (아직 등장하지 않은 알파벳은 -1로 표시)
        for (int i = 0; i < 26; i++) {
            arr[i] = -1;
        }

        // 문자열 S에서 각 알파벳의 첫 등장 위치를 기록
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            int index = c - 'a'; // 'a'를 0으로 매핑
            if (arr[index] == -1) { // 처음 등장한 경우에만 위치 기록
                arr[index] = i;
            }
        }

        // 결과 출력
        for (int i = 0; i < 26; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}*/

//p.8958

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        
    }
}

