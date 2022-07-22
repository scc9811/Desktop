import java.io.*;

public class Star_10_Recursion {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for (int i=0; i<N; i++){
            for (int j=0; j<N; j++){
                Star(i,j,N,bw);
            }
            bw.write("\n");
        }
        bw.close();





    }
    public static void Star(int i, int j, int num, BufferedWriter bw) throws IOException {
        if (i/num%3==1 && j/num%3==1){
            bw.write(" ");
        }
        else{
            if (num/3==0){
                bw.write("*");
            }
            else Star(i,j,num/3,bw);
        }




//        array[start][start] = '*';
//        array[start][start+1] = '*';
//        array[start][start+2] = '*';
//        array[start+1][start] = '*';
//        array[start+1][start+1] = ' ';
//        array[start+1][start+2] = '*';
//        array[start+2][start] = '*';
//        array[start+2][start+1] = '*';
//        array[start+2][start+2] = '*';




    }


}
