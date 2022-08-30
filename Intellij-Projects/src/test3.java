import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class test3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(testCase-->0){
            int[] array = new int[26];
            String s1 = br.readLine();
            array[s1.charAt(0)-97]++;
            array[s1.charAt(1)-97]++;
            String s2 = br.readLine();
            array[s2.charAt(0)-97]++;
            array[s2.charAt(1)-97]++;

            int max=1;
            int second=1;
            for(int i=0; i<26; i++){
                if(array[i]>0) {
                    if(array[i]>max) max=array[i];
                    else{
                        second = Math.max(array[i],second);
                    }
                }
            }
            if(max==2 && second==2) sb.append(1);
            else sb.append(4-max);
            sb.append('\n');
        }
        System.out.println(sb);




    }
}