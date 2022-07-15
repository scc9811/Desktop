import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordMath_greedy {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] sArray = new String[N];
        int[] length = new int[N];
        int maxLength = 0;
        for (int i=0; i<N; i++){
            sArray[i] = br.readLine();
            length[i] = sArray[i].length();
            maxLength = Math.max(maxLength,length[i]);
        }
        for (int i=0; i<N; i++){

        }



















    }
}
