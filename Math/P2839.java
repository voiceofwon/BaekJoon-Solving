package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2839 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(sol(N));

    }

    public static int sol(int n){
        int s =3;
        int count = 0;

        while(true){
            int temp = n-s*count;
            if(temp < 0) return -1;
            if(temp %5 == 0){
                return temp /5 + count;
            }
            count++;
        }


    }
}
