import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SickKnight_greedy {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (N==1) System.out.println(1);
        else if (N==2) {
            if ((M+1)/2 <=4) System.out.println((M+1)/2);
            else System.out.println(4);
        }
        else if (M==5) {
            System.out.println(4);
        }
        else if (M<5) System.out.println(M);
        else{
            System.out.println(M-2);
        }






    }
}
