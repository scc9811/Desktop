import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Card2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int[] array = new int[n];
        for (int i=0; i<n; i++) array[i] = i+1;


        int count = n;
        int tmp;
        while(count >1){
            tmp = array[1];
            for (int i=0; i<count-1; i++){
                array[i] = array[i+1];
            }
            count--;
            for (int i=0; i<count-1; i++){
                array[i] = array[i+1];
            }
            array[count-1] = tmp;

        }
        System.out.println(array[0]);







    }
}
