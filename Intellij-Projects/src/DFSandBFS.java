import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DFSandBFS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int vertex = Integer.parseInt(st.nextToken());
        int[] array = new int[vertex+1];
        int edge = Integer.parseInt(st.nextToken());


        int start = Integer.parseInt(st.nextToken());

        for (int i=0; i<edge; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st2.nextToken());
            int to = Integer.parseInt(st2.nextToken());

            while (true){

            }







        }





    }
}
