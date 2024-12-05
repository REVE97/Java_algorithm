//solved.ac_class02
/*FeedBack

//2024.12.05
//1. Array 메소드 공부 필요
//2. 문제의 조건 자세히 나누기 필요
//3. boolean 변수 공부 필요
//4. 형변환 조심
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

//p.2231

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        

    }
}