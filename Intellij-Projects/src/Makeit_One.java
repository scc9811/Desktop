import java.util.Scanner;
public class Makeit_One {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int[] dp = new int[n+1];
        for (int i=2; i<dp.length; i++){
            if(i%6==0){
                dp[i] = Math.min(dp[i/2],dp[i/3])+1;
            }
            else if(i%3==0){
                dp[i] = Math.min(dp[i/3],dp[i-1])+1;
            }
            else if(i%2==0){
                dp[i] = Math.min(dp[i/2],dp[i-1])+1;
            }
            else dp[i]=dp[i-1]+1;

        }
        System.out.println(dp[n]);






    }

//    public static int division(int n,int count){
//        if(n==1) return count;
//        if(n%6==0){
//            if (division(n/2,count+1) <= division(n/3,count+1)) return division(n/2,count+1);
//            else return division(n/3,count+1);
//        }
//        else if(n%3==0){
//            if (division(n/3,count+1) <= division(n-1,count+1)) return division(n/3,count+1);
//            else return division(n-1,count+1);
//        }
//        else if(n%2==0){
//            if (division(n/2,count+1) <= division(n-1,count+1)) return division(n/2,count+1);
//            else return division(n-1,count+1);
//        }
//        else return division(n-1,count+1);
//
//    }

}
