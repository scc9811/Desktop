import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;



public class NandM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 1부터 N까지 M개 선택.

//        for (int i=0; i<function(N,M); i++){
//            for (int j=0; j<M; j++){
//                System.out.printf("%d ",);
//            }
//            System.out.println();
//        }







    }
    static int function(int n, int m){
        int result =1;
        for (int i=0; i<m; i++){
            result *=n;
            n--;
        }
        return result;

    }
}
