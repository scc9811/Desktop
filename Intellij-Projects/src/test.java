import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class test {
    static int n;
    static int[][] array;
    static int result=0;
    static ArrayList<int[]> arrayList = new ArrayList<>();

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        array = new int[n][n];
        Queen(0,0,0);
        System.out.println(result);









    }
    // queen 자리 2
    // 놓을 수 없는 자리 1
    // 놓을 수 있는 자리 0
    // 회귀 할때 몽땅 0으로 놓으면 안됨. ( 겹치는 자리가 있을 수 있음 )
    public static void Queen(int count, int startI, int startJ){

//        System.out.println("count= "+count);
//        System.out.println("result= "+result);
//        for (int i=0; i<n; i++){
//            System.out.println(Arrays.toString(array[i]));
//        }
//        System.out.println();

        if (count == n) {
            int count2=0;
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if(array[i][j]==2) count2++;
                }
            }
            if(count2==n) result++;
            return;
        }

        // startI 행
        for(int j=startJ; j<n; j++){
            if(array[startI][j]==0){
                // arrayList에 0인 인덱스들 추가 , 1로 변환
                for (int k=0; k<n; k++){
                    // 상하
                    if(array[startI][k]==0){
                        arrayList.add(new int[] {startI,k});
                        array[startI][k]=1;
                    }
                    // 좌우
                    if(array[k][j]==0){
                        arrayList.add(new int[] {k,j});
                        array[k][j]=1;
                    }
                }
                // 대각선
                int tmpI=startI;
                int tmpJ=j;
                while(tmpI>-1 && tmpJ>-1){
                    if(array[tmpI][tmpJ]==0){
                        arrayList.add(new int[] {tmpI,tmpJ});
                        array[tmpI][tmpJ]=1;
                    }
                    tmpI--;
                    tmpJ--;
                }
                tmpI=startI;
                tmpJ=j;
                while(tmpI<n && tmpJ<n){
                    if(array[tmpI][tmpJ]==0){
                        arrayList.add(new int[] {tmpI,tmpJ});
                        array[tmpI][tmpJ]=1;
                    }
                    tmpI++;
                    tmpJ++;
                }
                tmpI=startI;
                tmpJ=j;
                while(tmpI>-1 && tmpJ<n){
                    if(array[tmpI][tmpJ]==0){
                        arrayList.add(new int[] {tmpI,tmpJ});
                        array[tmpI][tmpJ]=1;
                    }
                    tmpI--;
                    tmpJ++;
                }
                tmpI=startI;
                tmpJ=j;
                while(tmpI<n && tmpJ>-1){
                    if(array[tmpI][tmpJ]==0){
                        arrayList.add(new int[] {tmpI,tmpJ});
                        array[tmpI][tmpJ]=1;
                    }
                    tmpI++;
                    tmpJ--;
                }

                array[startI][j]=2;


                Queen(count+1,startI,j);

                // arrayList에 있는 인덱스 자리들 0으로 변환
                int[] indexArray;
                for(int l=0; l<arrayList.size(); l++){
                    indexArray = arrayList.get(l);
                    array[indexArray[0]][indexArray[1]]=0;
                }
                arrayList.removeAll(arrayList);
            }
        }
        // startI+1 부터의 행
        for(int i=startI+1; i<n; i++){
            for(int j=0; j<n; j++){
                if(array[i][j]==0){
                    // arrayList에 0인 인덱스들 추가 , 1로 변환
                    for (int k=0; k<n; k++){
                        // 상하
                        if(array[i][k]==0){
                            arrayList.add(new int[] {i,k});
                            array[i][k]=1;
                        }
                        // 좌우
                        if(array[k][j]==0){
                            arrayList.add(new int[] {k,j});
                            array[k][j]=1;
                        }
                    }

                    // 대각선
                    int tmpI=i;
                    int tmpJ=j;
                    while(tmpI>-1 && tmpJ>-1){
                        if(array[tmpI][tmpJ]==0){
                            arrayList.add(new int[] {tmpI,tmpJ});
                            array[tmpI][tmpJ]=1;
                        }
                        tmpI--;
                        tmpJ--;
                    }
                    tmpI=i;
                    tmpJ=j;
                    while(tmpI<n && tmpJ<n){
                        if(array[tmpI][tmpJ]==0){
                            arrayList.add(new int[] {tmpI,tmpJ});
                            array[tmpI][tmpJ]=1;
                        }
                        tmpI++;
                        tmpJ++;
                    }
                    tmpI=i;
                    tmpJ=j;
                    while(tmpI>-1 && tmpJ<n){
                        if(array[tmpI][tmpJ]==0){
                            arrayList.add(new int[] {tmpI,tmpJ});
                            array[tmpI][tmpJ]=1;
                        }
                        tmpI--;
                        tmpJ++;
                    }
                    tmpI=i;
                    tmpJ=j;
                    while(tmpI<n && tmpJ>-1){
                        if(array[tmpI][tmpJ]==0){
                            arrayList.add(new int[] {tmpI,tmpJ});
                            array[tmpI][tmpJ]=1;
                        }
                        tmpI++;
                        tmpJ--;
                    }
                    array[i][j]=2;


                    Queen(count+1,i,j);

                    // arrayList에 있는 인덱스 자리들 0으로 변환
                    int[] indexArray;
                    for(int l=0; l<arrayList.size(); l++){
                        indexArray = arrayList.get(l);
                        array[indexArray[0]][indexArray[1]]=0;
                    }
                    arrayList.removeAll(arrayList);

                }
            }
        }


    }

}

