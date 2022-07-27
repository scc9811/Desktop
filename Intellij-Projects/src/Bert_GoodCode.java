import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
public class Bert_GoodCode{
    static boolean[] b = new boolean[246913];
    static int[] count_arr = new int[246913];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        solution();
        count();
        StringBuilder sb = new StringBuilder();
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n ==0) break;
            int sum = 0;
            sb.append(count_arr[2*n] - count_arr[n]).append("\n");
        }
        System.out.println(sb);
    }
    public static void solution(){
        b[0] = b[1] = true;
        for(int i=2;i<Math.sqrt(b.length);i++){
            if(b[i]) continue;
            for(int j= i*i;j<b.length;j+=i) b[j] = true;
        }
    }
    public static void count(){
        int count = 0;
        for(int i=2;i<b.length;i++){
            if(!b[i]) count++;
            count_arr[i] = count;
        }
    }
}
