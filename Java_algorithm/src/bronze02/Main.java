/*FeedBack

*/
package bronze02; //패키지 선언

/*p.2750

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];

        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}*/

/*p.2908

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String num1=st.nextToken(); //첫번째 수
        String num2=st.nextToken(); //두번째 수

        StringBuilder sb = new StringBuilder(num1);
        sb.reverse();
        int reverse_num1 = Integer.parseInt(sb.toString());

        StringBuilder sb2 = new StringBuilder(num2);
        sb2.reverse();
        int reverse_num2 = Integer.parseInt(sb2.toString());

        if(reverse_num1>reverse_num2){
            System.out.print(reverse_num1);
        } else{
            System.out.print(reverse_num2);
        }
    }
}*/

/*p.5622

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        
        int sum=0; //최소 시간

        for(int i=0;i<S.length();i++){
            char c = S.charAt(i);
            if('A'<=c && 'C'>=c){
                sum+=3;
            }else if('D'<=c && 'F'>=c){
                sum+=4;
            }else if('G'<=c && 'I'>=c){
                sum+=5;
            }else if('J'<=c && 'L'>=c){
                sum+=6;
            }else if('M'<=c && 'O'>=c){
                sum+=7;
            }else if('P'<=c && 'S'>=c){
                sum+=8;
            }else if('T'<=c && 'V'>=c){
                sum+=9;
            }else if('W'<=c && 'Z'>=c){
                sum+=10;
            }
        }
        System.out.println(sum);
    }
}*/

/*p.10870

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); //n번째 파보나치 수
        int arr[] = new int[n+1];

        if(n==0){
            System.out.println(0);
            return;
        }
        arr[0] = 0; //0번째
        arr[1] = 1; //1번째

        for(int i=2;i<=n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(arr[n]);
    }
}*/

//p.1712

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()); //고정비용
        int B = Integer.parseInt(st.nextToken()); //한대 생산비용
        int C = Integer.parseInt(st.nextToken()); //제품 판매가격

        if(B>=C){
            System.out.println(-1); //손익 분기점이 나지 않음
        } else {
            System.out.println((A/(C-B))+1);
        }
    }
}
