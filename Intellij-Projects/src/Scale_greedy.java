import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Scale_greedy {
    public static void main(String[] args)throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] array = new int[N];
        int sum=0;
        for (int i=0; i<N; i++){
            array[i] = Integer.parseInt(st.nextToken());
            sum += array[i];
        }
        Arrays.sort(array);
        int[] result = new int[sum+1];

        int[] start = new int[N];
        function(array, start, result, 0, 0);



        for (int i=1; i<sum+1; i++){
            if (result[i]==0){
                System.out.println(i);
                break;
            }
        }




//        for (int i=1; i<sum; i++){
//            if(result[i]==0) {
//                boolean tf = false;
//                int tmp =0;
//                int count =0;
//                // 뺄 값을 찾기위해서 array 한바퀴.
//                for (int j=0; j<N; j++){
//                    System.out.println("array[j] = "+array[j]);
//                    // array[j]를 뺐을때 그 값이 1인 경우.
//                    if(i-array[j] > 0 && result[i-array[j]]==1){
//                        tmp = array[j];
//                        for (int k=j; k<N; k++)
//                            if(array[j]==array[k]) count++;
//                        while(count-->0 && i-tmp >0){
//                            if(result[i-tmp] == 0) {
//                                System.out.println("i-tmp = "+(i-tmp));
//                                tf = true;
//                                break;
//                            }
//                            tmp += array[j];
//
//                        }
//                    }
//                    if (tf) break;
//                }
//
//                if (tf){
//                    result[i]=1;
//                }
//                else{
//                    System.out.println(i);
//                }
//                if (!tf) System.out.println(i);
//                else{
//                    result[i] = 1;
//                    System.out.println(i);
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(result));




//        int[][] result = new int[sum][N+1];
//        for (int i=0; i<N; i++){
//            result[array[i]][N] = 1;
//            result[array[i]][i] = 1;
//        }
//
//        for (int i=0; i<sum; i++){
//            for (int j=0; j<N+1; j++){
//                System.out.print(result[i][j]);
//            }
//            System.out.println();
//        }
//        for (int i=1; i<N; i++){
//            for (int j=0; j<N; j++){
//
//            }
//        }




    }
    public static void function(int[] array1, int[] array2, int[] result, int n, int count){
        if (count==array1.length){}
        else {
            function(array1, array2, result, n, count + 1);
            array2[count] = 1;
            n += array1[count];
            result[n] = 1;
            function(array1, array2, result, n, count + 1);
        }








    }


}
