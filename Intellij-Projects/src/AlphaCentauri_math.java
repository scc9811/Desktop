import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AlphaCentauri_math {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase-->0){
            int count =0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());



            end = end-start;
            start = 0;

//            if(end==1) count=1;
//            else if(end==2) count=2;
//            else{
//                long k = 0;
//                for(int i=1; i<(int)Math.pow(2,31); i++){
//                    k = i*(i+1) + i+1;
//                    if(end<k) break;
//                }
//
//
//
//
//            }

            for (int i=1; i<Math.pow(2,31); i++){
                if(end<i*(i+1)+i+1){
                    System.out.println(2*(i-1)+1);
                    break;
                }
            }























        }












    }
}
