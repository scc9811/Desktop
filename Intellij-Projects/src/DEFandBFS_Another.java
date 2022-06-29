import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DEFandBFS_Another {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int vertex = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());
        int startt = start;
        int[][] array = new int[vertex+1][vertex+1];
        int[] visited = new int[vertex+1];

        for (int i=0; i<edge; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st2.nextToken());
            int to = Integer.parseInt(st2.nextToken());

            if(array[from][to] !=1){
                array[from][to] = 1;
                array[to][from] = 1;
            }
        }
        visited[start] = 1;
        DFS(array, visited, start);
        System.out.println();

        // BFS 너비우선탐색
        Queue<Integer> queue = new LinkedList<>();
        // visited 리스트 초기화
        for (int i=1; i<visited.length; i++){
            visited[i] = 0;
        }


        queue.add(startt);
        visited[startt] = 1;
        while (!queue.isEmpty()){
            startt = queue.poll();
            System.out.print(startt+" ");
            for(int i=1; i<array[startt].length; i++){
                if (array[startt][i] == 1 && visited[i]==0){
                    visited[i] = 1;
                    queue.add(i);
                }
            }


        }



    }
    static void DFS(int[][] array, int[] visited, int start){
        System.out.print(start+" ");
        for (int i=1; i<array[start].length; i++){
            if (array[start][i]==1 && visited[i]==0){
                visited[i] = 1;
                DFS(array, visited, i);
//                start = i;
//                DFS(array, visited, start);
            }
        }



    }
}
