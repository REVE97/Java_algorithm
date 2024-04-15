/* 10807번
import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());;

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int b = Integer.parseInt(br.readLine());

        for(int j = 0; j < arr.length; j++){
            if(b == arr[j]) {
                count++;
            }
        }
        System.out.println(count);
    }
}

 */

/* 10871번
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        StringTokenizer sk = new StringTokenizer(br.readLine());

        int[] arr = new int[N];

        for(int i=0; i<arr.length; i++ ){
            arr[i] = Integer.parseInt(sk.nextToken());
        }

        for(int j=0; j<arr.length; j++){
            if(arr[j]<X){
                System.out.print(arr[j]+" ");
            }
        }

    }
}

 */

/* 10818번
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = -1000000;
        int min = 1000000;

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int j=0; j<arr.length; j++){
            if(arr[j]<min){
                min=arr[j];
            }
            if(arr[j]>max){
                max=arr[j];
            }
        }

        System.out.print(min+" ");
        System.out.print(max);

    }
}

 */

/* 2562번
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N=9;
        int max=0;
        int count=0;
        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int j=0; j<arr.length; j++){
            if(arr[j]>max) {
                max=arr[j];
                count=j+1;
            }
        }

        System.out.println(max);
        System.out.println(count);

    }
}

 */

/* 10810 번
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {

        
    }
}

 */










