import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Climbing_stairs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int stairs = Integer.parseInt(br.readLine());
        int[] stairs_score = new int[stairs];
        for (int i=0; i<stairs; i++){
            stairs_score[i] = Integer.parseInt(br.readLine());
        }
        // 1칸,2칸 && 2칸,1칸 배열 인덱스 달라야함.
        int[] dp = new int[stairs*3];
        int current = stairs;










    }
}
