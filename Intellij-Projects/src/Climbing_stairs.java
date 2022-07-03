import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Climbing_stairs {
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int stairs = Integer.parseInt(br.readLine());
        // index 0 은 시작위치.
        dp = new int[stairs+1];
        int[] result = new int[stairs+1];


        int[] stairs_score = new int[stairs+1];
        for (int i=1; i<stairs_score.length; i++)
            stairs_score[i] = Integer.parseInt(br.readLine());


        dp[1] = stairs_score[1];
        dp[2] = Math.max(dp[1],dp[1]+stairs_score[2]);
        int current =3;
        while (current<=stairs){
            if(dp[current-1] == dp[current-2] + stairs_score[current-1])
                dp[current] = dp[current-2]+stairs_score[current];
            else
                dp[current] = Math.max(dp[current-1],dp[current-2]) + stairs_score[current];
            current++;
            System.out.println(Arrays.toString(dp));
        }
        System.out.println(dp[dp.length-1]);

    }

}
