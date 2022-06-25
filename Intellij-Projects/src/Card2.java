import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
public class Card2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        Queue<Integer> queue = new LinkedList<>();
        for (int i=0; i<n; i++){
            queue.add(i+1);
        }


        while(n>1){
            queue.remove();
            queue.add(queue.poll());
            n--;
        }
        System.out.println(queue.poll());

    }
}
