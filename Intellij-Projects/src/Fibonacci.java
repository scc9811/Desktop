import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int testCase = stdIn.nextInt();
        int[] array;
        for (int i=0; i<testCase; i++){
            array = new int[2];
            int N = stdIn.nextInt();
            Count(N, array);
            System.out.printf("%d %d\n",array[0],array[1]);

        }

    }
    public static void Count(int n, int[] array){
        if (n==1){
            array[1]++;
        }
        else if(n == 0) {
            array[0]++;
        }
        else {
            Count(n-1, array);
            Count(n-2, array);

        }

    }
}
