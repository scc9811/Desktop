import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AtoB_greedy {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        boolean tf = false;
        int count =1;
        while (B>A){
            if (B%10==1){
                B /=10;
                count++;
            }
            else if(B%2==0){
                B /=2;
                count++;
            }
            else{
                break;
            }
        }
        if (A==B) System.out.println(count);
        else System.out.println(-1);
















    }
}
