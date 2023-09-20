package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2231 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int N = Integer.parseInt(input);
        int ans = 0;

        for(int i =1;i<=N;i++){
            Num a = new Num(i,(i+"").length());
            //System.out.println(a.total());
            if(a.total() == N){
                ans = a.n;
                break;
            }
        }

        System.out.println(ans);

    }

    public static class Num{
        int n;
        int length;

        public Num(int n, int length){
            this.n = n;
            this.length =length;
        }

        public int total (){
            String Inum = n +"";
            int sum =n;
            for(int i=0;i<length;i++){
                sum += Integer.parseInt(Inum.charAt(i) +"");
            }

            return sum;
        }
    }
}
