import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MazeSearch_graph {
    public static void main(String[] args)throws IOException {
        Stack<int[]> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] array = new int[N][M];

        for (int i=0; i<N; i++){
            String s = br.readLine();
            for (int j=0; j<M; j++){
                array[i][j] = Integer.parseInt(s.substring(j,j+1));
            }
        }
        int currentI = 0;
        int currentJ = 0;
        int count = 0;

        int[] current = {currentI,currentJ,count};

        stack.add(current);






//        for (int i=0; i<N; i++){
//            System.out.println(Arrays.toString(array[i]));
//        }





    }
}
