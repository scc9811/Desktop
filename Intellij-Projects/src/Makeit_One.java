import java.util.Scanner;

public class Makeit_One {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int count=0;
        System.out.println(division(n,count));

    }

    public static int division(int n,int count){
        if(n==1) return count;
        if(n%6==0){
            if (division(n/2,count+1) <= division(n/3,count+1)) return division(n/2,count+1);
            else return division(n/3,count+1);
        }
        else if(n%3==0){
            if (division(n/3,count+1) <= division(n-1,count+1)) return division(n/3,count+1);
            else return division(n-1,count+1);
        }
        else if(n%2==0){
            if (division(n/2,count+1) <= division(n-1,count+1)) return division(n/2,count+1);
            else return division(n-1,count+1);
        }
        else return division(n-1,count+1);

    }
}
