import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args){
        int[] array = new int[9];
        for (int i=0; i<9; i++){
            array[i] = i;
        }

        // my method
        System.out.println(BinarySearch(array,4));

        // library method
        System.out.println(Arrays.binarySearch(array,4));



    }
    static int BinarySearch(int[] a, int n){
        int pl = 0; int pr = a.length; int pc;

        while (pl<pr){
            pc = (pl+pr)/2;
            if(a[pc]==n) return pc;
            else if (a[pc] > n) pr = pc-1;
            else pl = pc+1;
        }

        return -1;
    }
}
