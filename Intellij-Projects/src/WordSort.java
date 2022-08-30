import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class WordSort {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        String[][] array = new String[testCase][2];
        for(int i=0; i<testCase; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            array[i][0] = st.nextToken();
            array[i][1] = st.nextToken();
        }
        Arrays.sort(array, Comparator.comparing(o1->o1[0]));

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<testCase; i++){
            sb.append(array[i][0]).append(' ').append(array[i][1]).append('\n');
        }
        System.out.println(sb);












    }
}
