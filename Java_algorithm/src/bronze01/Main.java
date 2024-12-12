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

//p.2309번

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
}