import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Coins {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] dp = new int[10001];
        int[] array = new int[n];
        for (int i=0; i<n; i++){
            array[i] = Integer.parseInt(br.readLine());
            dp[array[i]] = 1;
        }

        Arrays.sort(array);

        for (int i=1; i<=k; i++){
            int tmp=0;
            for(int j=0; j<array.length; j++){
                try{
                    dp[i] += dp[i-array[j]];
                    tmp=j;
                }
                catch (ArrayIndexOutOfBoundsException e){
                    break;
                }
            }

        }
        System.out.println(Arrays.toString(dp));






    }











}
