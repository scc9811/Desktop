import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoldBach {
    static boolean[] array = new boolean[10001];
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int max = 3;
        array[2] = true;
        while (testCase-->0){
            int n = Integer.parseInt(br.readLine());
            if (n>max){
                for (int i=max; i<=n; i++){
                    boolean tf = true;
                    for (int j=2; j*j<=i; j++){
                        if (i%j==0){
                            tf = false;
                            break;
                        }
                    }
                    if (tf) array[i]=true;
                    else array[i] = false;
                }
            }
            for (int i=n/2; i<n; i++){
                if (array[i] && array[n-i]){
                    System.out.println(n-i+" "+i);
                    break;
                }
            }







        }











    }

}
