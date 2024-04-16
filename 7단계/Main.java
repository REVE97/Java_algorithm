/* 2738번
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

        int[][] matrix_1 = new int[N][M];
        int[][] matrix_2 = new int[N][M];

        for(int i = 0; i<N; i++){
            StringTokenizer sk = new StringTokenizer(br.readLine());
            for(int j = 0; j<M; j++ ){
                matrix_1[i][j] = Integer.parseInt(sk.nextToken());
            }
        }

        for(int i = 0; i<N; i++){
            StringTokenizer sk = new StringTokenizer(br.readLine());
            for(int j = 0; j<M; j++ ){
                matrix_2[i][j] = Integer.parseInt(sk.nextToken());
            }
        }

        for (int i =0; i<N; i++){
            for (int j=0; j<M; j++){
                System.out.print((matrix_1[i][j]+matrix_2[i][j])+" ");
            }
            System.out.println();
        }
    }
}

 */

/* 2566번
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] matrix = new int[9][9];
        int max =Integer.MIN_VALUE;
        int row =0;
        int cols = 0;


        for(int i=0; i<9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j =0; j<9; j++){
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<9; i++){
            for(int j=0;j<9;j++){
                if(matrix[i][j]>max){
                    max=matrix[i][j];
                    row = i+1;
                    cols= j+1;
                }
            }
        }

        System.out.println(max);
        System.out.println(row+" "+cols);

    }
}

 */