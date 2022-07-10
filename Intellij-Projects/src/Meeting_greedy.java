import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Meeting_greedy {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int meetingCount = Integer.parseInt(br.readLine());
        int[][] array = new int[meetingCount][2];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        array[0][0] = Integer.parseInt(st2.nextToken());
        array[0][1] = Integer.parseInt(st2.nextToken());
        for (int i=1; i<meetingCount; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            array[i][0] = Integer.parseInt(st.nextToken());
            array[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array, Comparator.comparingInt(o1 -> o1[0]));
        Arrays.sort(array, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) return o1[1] - o2[1];
                else return o1[0] - o2[0];
            }
        });
        for(int i=0; i<array.length; i++){
            for (int j=0; j<2; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void insert(int[][] array , int n , int length){
        for (int i=length+1; i>n; i--)
            array[i] = array[i-1];
    }
}
