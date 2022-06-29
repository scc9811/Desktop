public class test2 {
    public static void main(String[] args){
        int count =0;
        while(true){
            for (int i=0; i<8; i++){
                System.out.println(i);
                if(i==4) continue;
            }
            count++;
            if (count==4) break;
        }
    }
}
