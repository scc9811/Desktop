import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class consecutive_sum {

    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];
        dp = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<array.length; i++)
            array[i] = Integer.parseInt(st.nextToken());

        for (int start=0; start<array.length; start++){
            for (int j = start; j<array.length; j++){
                if (j==start) dp[start] = array[start];
                else{
                    dp[j] = dp[j-1]+array[j];
                }
            }
            for (int j=array.length-1; j>start; j--){
                if (Math.max(dp[j],dp[j-1])==dp[j]) dp[j-1] = dp[j];
            }
        }
        int result = dp[0];
        for (int i=1; i<dp.length; i++){
            if (dp[i]>result) result = dp[i];
        }
        System.out.println(result);













    }
}
