package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2292 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        //1,6,12,18,24
        //1 7 19 37 61
        long flag =1;
        int g = 1;
        while(flag < N){

            flag +=6*g;
            g++;
        }

        if(N == 1){
            g = 1;
        }
        System.out.println(g);
    }
}
