import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sequence_dp {
    static long[] dp = new long[101];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        dp[1] = 1;
        dp[2] = 1;
        while (testCase-- > 0){
            int n = Integer.parseInt(br.readLine());
            if (dp[n]==0){
                for (int i=3; i<=n; i++){
                    dp[i] = dp[i-3]+dp[i-2];
                }
            }
            System.out.println(dp[n]);
        }
    }
}
