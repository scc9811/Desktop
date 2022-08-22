import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Alphabet_graph {
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static boolean[] tfArray = new boolean[26];
    public static void main(String[] args)throws IOException {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[][] array = new int[r][c];
        for(int i=0; i<r; i++){
            String s = br.readLine();
            for(int j=0; j<c; j++){
                array[i][j] = s.charAt(j)-65;
            }
        }
        boolean[][] tfArray2 = new boolean[r][c];



        stack.add(0);
        stack.add(0);
        int count=0;
        int max=0;
        while(!stack.isEmpty()){
            int startJ=stack.pop();
            int startI=stack.pop();
            tfArray[array[startI][startJ]]=true;
            count++;
            if(count!=1) {
                queue.add(startI);
                queue.add(startJ);
            }
            System.out.println(queue);
//            System.out.println("stack = "+stack);
//            System.out.println("queue = "+queue);

            int tmp=0;
            for(int i=0; i<4; i++){
                int newI=startI+dx[i];
                int newJ=startJ+dy[i];
                if(newI<r && newI>=0 && newJ<c && newJ>=0 && !tfArray[array[newI][newJ]]){
                    stack.add(newI);
                    stack.add(newJ);
                    tmp++;
                }
            }
            if(tmp==0 && !stack.isEmpty()){
                max = Math.max(max,count);
                int y=stack.pop();
                int x=stack.peek();
                count-=(Math.abs(startI-x)+Math.abs(startJ-y));
                stack.add(y);
                while(!queue.isEmpty()){
                    tfArray[array[queue.poll()][queue.poll()]]=false;
                }
            }

        }

        System.out.println(max);

        // 벽에 막혀서 돌아갈때 돌아간 경로 모두 false 로 변환 해줘야 함.








    }

}
