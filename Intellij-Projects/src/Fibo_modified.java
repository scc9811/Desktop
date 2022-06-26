import java.util.Scanner;
public class Fibo_modified {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int testCase = stdIn.nextInt();
        for (int i=0; i<testCase; i++){
            int n = stdIn.nextInt();
            int zeroCount =0;
            int oneCount =0;
            System.out.printf("%d %d\n",Case_0(n,zeroCount),Case_1(n,oneCount));
        }




    }
    public static int Case_0(int n, int count){
        if (n==0){
            count++;
            return count;
        }
        else if(n==1) return 0;
        else{
            return (Case_0(n-1,count)+Case_0(n-2,count));
        }
    }
    public static int Case_1(int n, int count){
        if (n==0) return 0;
        else if (n==1) {
            count++;
            return count;

        }
        else return (Case_1(n-1,count)+Case_1(n-2,count));
    }
}
