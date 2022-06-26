import java.util.Scanner;

public class dp_BottomUp {
    static int[] dp;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for (int i=0; i<testCase; i++) {

            int n = sc.nextInt();
            dp = new int[n + 1];
            int zeroCount = 0;
            int oneCount = 0;

            System.out.printf("%d %d\n", zeroC(n), oneC(n));
        }

    }
    static int zeroC(int n){
        if(n==0) return 1;
        dp[0] = 1;
        dp[1] = 0;
        for (int i=2; i<n+1; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    static int oneC(int n) {
        if(n==0) return 0;
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
