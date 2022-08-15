import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Queen_backTracking {
    static int n,result,count2,indexI,indexJ;
    static int[][] array;
    static Queue<Integer> queue = new LinkedList<>();
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        array = new int[n][n];
        result=0;
        Queen(0,0,0);
        System.out.println(result);















    }
    public static void Queen(int count, int startI, int startJ){
        System.out.println("count= "+count);
        for(int i=0; i<n; i++){
            System.out.println(Arrays.toString(array[i]));
        }
        if(count==n){
            count2=0;
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if(array[i][j]==2){
                     count2++;
                    }
                }
            }
            if(count2==n){
                result++;
            }
            return;
        }


        for(int j=startJ; j<n; j++){
            if(array[startI][j]==0){
                for(int k=0; k<n; k++){
                    array[startI][k]=1;
                    array[k][j]=1;
                }
                indexI=startI+1;
                indexJ=j+1;
                while(indexI<n && indexJ<n){
                    if(array[indexI][indexJ]==0) {
                        queue.add(indexI);
                        queue.add(indexJ);
                        array[indexI][indexJ]=1;
                    }
                    indexI++;
                    indexJ++;
                }
                indexI=startI-1;
                indexJ=j-1;
                while(indexI>=0 && indexJ>=0){
                    if(array[indexI][indexJ]==0) {
                        queue.add(indexI);
                        queue.add(indexJ);
                        array[indexI][indexJ]=1;
                    }
                    indexI--;
                    indexJ--;
                }
                indexI=startI+1;
                indexJ=j-1;
                while(indexI<n && indexJ>=0){
                    if(array[indexI][indexJ]==0) {
                        queue.add(indexI);
                        queue.add(indexJ);
                        array[indexI][indexJ]=1;
                    }
                    indexI++;
                    indexJ--;
                }
                indexI=startI-1;
                indexJ=j+1;
                while(indexI>=0 && indexJ<n){
                    if(array[indexI][indexJ]==0) {
                        queue.add(indexI);
                        queue.add(indexJ);
                        array[indexI][indexJ]=1;
                    }
                    indexI--;
                    indexJ++;
                }
                array[startI][j]=2;
                Queen(count+1,startI,j);
                array[startI][j]=0;
                while(!queue.isEmpty()){
                    array[queue.poll()][queue.poll()]=0;
                }
            }
        }

        // startI행만 stratJ부터 , startI+1행 이후로는 0부터.
        for(int i=startI+1; i<n; i++){
            for(int j=0; j<n; j++){
                if(array[i][j]==0){
                    for(int k=0; k<n; k++){
                        array[i][k]=1;
                        array[k][j]=1;
                    }
                    indexI=i+1;
                    indexJ=j+1;
                    while(indexI<n && indexJ<n){
                        if(array[indexI][indexJ]==0) {
                            queue.add(indexI);
                            queue.add(indexJ);
                            array[indexI][indexJ]=1;
                        }
                        indexI++;
                        indexJ++;
                    }
                    indexI=i-1;
                    indexJ=j-1;
                    while(indexI>=0 && indexJ>=0){
                        if(array[indexI][indexJ]==0) {
                            queue.add(indexI);
                            queue.add(indexJ);
                            array[indexI][indexJ]=1;
                        }
                        indexI--;
                        indexJ--;
                    }
                    indexI=i+1;
                    indexJ=j-1;
                    while(indexI<n && indexJ>=0){
                        if(array[indexI][indexJ]==0) {
                            queue.add(indexI);
                            queue.add(indexJ);
                            array[indexI][indexJ]=1;
                        }
                        indexI++;
                        indexJ--;
                    }
                    indexI=i-1;
                    indexJ=j+1;
                    while(indexI>=0 && indexJ<n){
                        if(array[indexI][indexJ]==0) {
                            queue.add(indexI);
                            queue.add(indexJ);
                            array[indexI][indexJ]=1;
                        }
                        indexI--;
                        indexJ++;
                    }
                    array[i][j]=2;
                    Queen(count+1,i,j);
                    array[i][j]=0;

                    while(!queue.isEmpty()){
                        array[queue.poll()][queue.poll()]=0;
                    }
                }
            }
        }




    }
}
