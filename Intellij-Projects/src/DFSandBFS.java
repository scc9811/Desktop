import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DFSandBFS {
    public static void main(String[] args) throws IOException {
        Queue<Integer> queue = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int vertex = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        int[][] array = new int[edge][2];

        int[] visited = new int[vertex+1];
        for (int i=1; i<vertex+1; i++)
            visited[i] = i;

        for (int i=0; i<edge; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int f =Integer.parseInt(st2.nextToken());
            int t =Integer.parseInt(st2.nextToken());
            if (f > t){
                int tmp = f;
                f = t;
                t = tmp;
            }
            if(i==0) {
                array[i][0] = f;
                array[i][1] = t;
            }

            // 오름차순으로 맞는 위치에 삽입.
            for (int j =0; j<i; j++){
                if(array[i][0]==f && array[i][1]>t){


                }

            }
        }

        // DFS (깊이우선탐색)

        int from = start;
        boolean bChange;
        while(true){
            System.out.print(from+" ");
            visited[from] =-1;
            bChange=false;
            for (int i=0; i<array.length; i++){
                if(array[i][0]==from && visited[array[i][1]] != -1){
                    from = array[i][1];
                    bChange = true;
                    break;
                }
                else if(array[i][1]==from && visited[array[i][0]] != -1){
                    from = array[i][0];
                    visited[from] = -1;
                    bChange = true;
                    break;
                }
            }
            if (bChange) break;

        }
        System.out.println();

        // BFS (너비우선탐색)

        for (int i=1; i<vertex+1; i++)
            visited[i]=i;

        queue.add(start);
        visited[start] =-1;
        int newstart;
        while(!queue.isEmpty()){
            newstart = queue.poll();
            System.out.print(newstart+" ");
            for(int i=0; i<array.length; i++){
                if(array[i][0]==newstart && visited[array[i][1]]!=-1){
                    queue.add(array[i][1]);
                    visited[array[i][1]]=-1;
                }
                else if (array[i][1]==newstart && visited[array[i][0]] !=-1){
                    queue.add(array[i][0]);
                    visited[array[i][0]]=-1;
                }
            }
        }







    }

}
