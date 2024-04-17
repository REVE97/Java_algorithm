/* 2751번
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<N; i++){
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for(int result : list){
            sb.append(result).append("\n");
        }

        System.out.println(sb);
    }
}

 */

/* 2167번
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb =new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] matrix = new int[N][M];

        for(int i =0; i<N; i++){
            StringTokenizer sk = new StringTokenizer(br.readLine());
            for(int j =0; j<M; j++){
                matrix[i][j] = Integer.parseInt(sk.nextToken());
            }
        }

        int K = Integer.parseInt(br.readLine());

        for(int s = 0; s<K; s++){
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(stk.nextToken())- 1;
            int j = Integer.parseInt(stk.nextToken()) -1;
            int x = Integer.parseInt(stk.nextToken()) -1;
            int y = Integer.parseInt(stk.nextToken()) -1;
            int sum =0;

            for(int p =i; p<=x; p++){
                for(int q =j; q<=y; q++){
                    sum+=matrix[p][q];
                }
            }
            sb.append(sum+"\n");
        }
        System.out.print(sb);
    }
}

 */

/* 1337번 (미완)
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] array = new int[N];
        int result=5;
        int cnt=0;

        for(int i =0; i<N; i++){
            array[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(array);

        for(int j=0; j<array.length-1; j++){
            if(array[j+1]-array[j]==1){
                cnt+=1;
            }
        }

        System.out.print(result-cnt);
    }
}

 */

