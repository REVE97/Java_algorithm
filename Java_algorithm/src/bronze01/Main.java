/*FeedBack


*/
package bronze01; //패키지 선언

/*p.4344
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int C = Integer.parseInt(br.readLine()); //테스트 케이스
        double[] percent = new double[C]; //결과값 출력 배열

        for(int i=0;i<percent.length;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[] arr = new int[N];
            double sum=0; //학생들의 점수 합
            double avg=0; //평균
            double count=0; //평균넘는 학생수

            for(int j=0;j<arr.length;j++){
                arr[j] = Integer.parseInt(st.nextToken());
                sum+=arr[j];
            }
            
            avg = sum/N; //평균 구하기
            
            for(int j=0;j<arr.length;j++){
                if(arr[j]>avg){
                    count++; //평균 넘으면 카운트 증가
                }
            }
            percent[i] = (count/N)*100; //%화 하기
        }
        
        //출력
        for(int i=0;i<percent.length;i++){
            System.out.printf("%.3f",percent[i]);
            System.out.println("%");
        }
    }
}*/

/*p.11653

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for(int i=2;i<N;i++){
            while(N%i==0){
                System.out.println(i);
                N/=i;
            }
        }
        if(N>1){
            System.out.println(N);
        }
    }
}*/

/*p.2309번

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[9];
        int sum=0;
        
        //아홉 난쟁이 키 입력
        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum+=arr[i];
        }

        //난쟁이 두명 제외 조건문
        for(int i=0;i<8;i++){
            for(int j=i+1;j<9;j++){
                if(sum-arr[i]-arr[j]==100){
                    arr[i]=-1;
                    arr[j]=-1;

                    Arrays.sort(arr); //오름차순 배열
                    for(int k=2;k<arr.length;k++){
                        System.out.println(arr[k]);
                    }
                    return; //종료
                }
            }
        }
    }
}*/

/*p.1110

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num = br.readLine();
        
        int cycle = 0; // 사이클 횟수

        if(Integer.parseInt(num)<=9){
            num = "0"+num; //한자리 수 일때 앞에 0추가
        }

        int origin_num = Integer.parseInt(num);
        int current_num = origin_num;

        while(true){
            int tens = current_num/10;
            int ones = current_num%10;
            int sum = tens+ones;

            current_num = (ones*10) + (sum%10);
            cycle++;

            if(current_num==origin_num){
                break;
            }
        }
        System.out.println(cycle);
    }
}*/

/*p.1157

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine().toUpperCase(); //단어 입력후 대문자로 리턴

        int alpha_count[] = new int[26];

        for(int i=0;i<S.length();i++){
            char c = S.charAt(i);
            alpha_count[c-'A']++;
        }

        int max=0;
        char result=0;

        for(int i=0;i<alpha_count.length;i++){
            if(alpha_count[i]>max){
                max=alpha_count[i];
                result=(char)(i+'A');
            } else if (alpha_count[i]==max){
                result='?';
            }
        }

        System.out.println(result);
    }
}*/

/*p,1934

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); //테스트 횟수
        int result[] = new int[T];

        //비교할 A,B 입력
        //최대공약수를 구하고 계산?
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            
            //최대공약수 찾기
            int max = 1;
            for(int j=1;j<=Math.min(A,B);j++){
                if((A%j==0)&&(B%j==0)){
                    max=j;
                }
            }
            //최소공배수 계산
            result[i] = max*(A/max)*(B/max);
        }

        for(int i=0;i<T;i++){
            System.out.println(result[i]);
        }
    }
}*/

// p.2748
// 피보나치 수2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long[] fibo = new long[n + 1];
        fibo[0] = 0;
        if (n > 0) fibo[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        System.out.println(fibo[n]);
    }
}