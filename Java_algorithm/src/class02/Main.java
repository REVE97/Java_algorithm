//solved.ac_class02
/*FeedBack

//2024.12.05
//1. Array 메소드 공부 필요
//배열을 오름차순으로 정렬할때 : Arrays.sort(), 내림차순으로 정렬할때: Arrays.sort(배열명, Collections.reverseOrder())
//단 Collections.reverseOrder()을 사용할 때 int[]가 아닌 Integer[]처럼 클래스로 객체가 선언해야함.
//String 은 상관없음
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

//p.2869(달팽이 문제)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()); //올라가는 길이
        int B = Integer.parseInt(st.nextToken()); //내려오는 길이
        int V = Integer.parseInt(st.nextToken()); //나무 높이

        int day = (V-B-1)/(A-B) +1;

        System.out.print(day);
    }
}