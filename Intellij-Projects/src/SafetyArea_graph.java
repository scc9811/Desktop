import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SafetyArea_graph {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[][] array = new int[size][size];
        for (int i=0; i<size; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<size; j++){
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int height = 1;






    }
}
