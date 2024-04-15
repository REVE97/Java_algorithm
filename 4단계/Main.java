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

/* 10810번
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        for(int s=0; s<M; s++){
            StringTokenizer sk = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(sk.nextToken());
            int j = Integer.parseInt(sk.nextToken());
            int k = Integer.parseInt(sk.nextToken());

            for(int x = i-1; x < j; x++){
                arr[x] = k;
            }
        }

        for(int i=0; i<N; i++){
            System.out.print(arr[i]+" ");
        }

    }
}

 */

/* 10813 번
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        for(int k=0; k<N; k++){
            arr[k]=k+1;
        }

        for(int s=0; s<M; s++){
            StringTokenizer sk = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(sk.nextToken());
            int j = Integer.parseInt(sk.nextToken());

            int temp=arr[i-1];
            arr[i-1]=arr[j-1];
            arr[j-1]=temp;
        }

        for(int i=0; i<N; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

 */

/* 5597번
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[31];
        for(int i = 0 ; i < 28 ; i++) {
            arr[Integer.parseInt(br.readLine())] = 1;
        }
        for(int i = 1 ; i <= 30 ; i++) {
            if(arr[i] == 0) System.out.println(i);
        }
    }
}

 */

/* 3052번
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> h = new HashSet<Integer>();

        for(int i = 0;i<10;i++){
            h.add(Integer.parseInt(br.readLine())%42);
        }

        System.out.print(h.size());

    }
}

 */

/* 10811번
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] array = new int[N];
        int temp =0;

        for(int k=0; k<N; k++){
            array[k]=k+1;
        }

        for(int s=0; s<M; s++){

            StringTokenizer sk = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(sk.nextToken())-1;
            int j = Integer.parseInt(sk.nextToken())-1;

            while(i<j){
                temp=array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }

        }

        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }

    }
}

 */














