import java.io.*;
import java.util.*;


public class test2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());

        int[] sumArray = new int[size+1];
        int testCase = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        sumArray[1] = Integer.parseInt(st.nextToken());

        int sum=sumArray[1];
        for (int i=2; i<size+1; i++){
            sum +=Integer.parseInt(st.nextToken());
            sumArray[i] = sum;
        }

        StringBuilder sb = new StringBuilder();
        while (testCase-->0){
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            sb.append(sumArray[end]-sumArray[start-1]).append('\n');
        }
        bw.write(sb.toString());
        bw.close();


    }

}
