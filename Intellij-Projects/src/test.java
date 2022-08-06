import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class test {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 3, 3, 3, 3, 3, 4, 5, 6};
        System.out.println(Arrays.binarySearch(array,3));

        System.out.println(array[100]);
    }
}
