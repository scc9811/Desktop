import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindNum_Quicksort {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int[] numArray = new int[N];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for (int i=0; i<N; i++){
            numArray[i] = Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(bf.readLine());

        StringTokenizer st2 = new StringTokenizer(bf.readLine());

        //퀵정렬
        quickSort(numArray, 0, N-1);

        //탐색
        for (int i=0; i<M; i++){
            if (binSearch(numArray, N, Integer.parseInt(st2.nextToken())) == -1)
                System.out.println(0);
            else System.out.println(1);
        }

    }

    static int binSearch(int[] a, int n, int key){
        int pl =0;
        int pr = n-1;

        do{
            int pc = (pl+pr)/2;
            if(a[pc] == key) return pc;
            else if (a[pc] < key) pl = pc+1;
            else pr = pc-1;
        } while (pl <= pr);

        return -1;
    }
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
    }
    static int sort3elem(int[] x, int a, int b, int c){
        if (x[b] < x[a]) swap(x, b, a);
        if (x[c] < x[b]) swap(x,c,b);
        if (x[b] < x[a]) swap(x,b,a);
        return b;
    }
    static void quickSort(int[] a, int left, int right){
        int pl = left;
        int pr = right;
        int m = sort3elem(a, pl, (pl+pr)/2 , pr);
        int x = a[m];

        swap(a, m, right-1);
        pl++;
        pr -=1;

        do{
            while (a[pl] < x )pl++;
            while (a[pr] > x) pr--;
            if(pl <= pr)
                swap (a, pl++, pr--);
        } while (pl <= pr);

        if (left < pr) quickSort(a, left, pr);
        if (pl < right) quickSort(a, pl, right);


    }

}
