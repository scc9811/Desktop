import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Scale_greedy {
    public static void main(String[] args)throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] array = new int[N];
        int sum=0;
        for (int i=0; i<N; i++){
            array[i] = Integer.parseInt(st.nextToken());
            sum += array[i];
        }
        Arrays.sort(array);
        int[] result = new int[sum];
        for (int i=0; i<N; i++){
            result[array[i]] = 0;
        }
        for (int i=2; i<N; i++){

        }













//        int[][] result = new int[sum][N+1];
//        for (int i=0; i<N; i++){
//            result[array[i]][N] = 1;
//            result[array[i]][i] = 1;
//        }
//
//        for (int i=0; i<sum; i++){
//            for (int j=0; j<N+1; j++){
//                System.out.print(result[i][j]);
//            }
//            System.out.println();
//        }
//        for (int i=1; i<N; i++){
//            for (int j=0; j<N; j++){
//
//            }
//        }




    }
}
