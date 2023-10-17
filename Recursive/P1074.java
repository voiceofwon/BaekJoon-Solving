package Recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1074 {
    static int ans = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        sol(N,r,c);
        System.out.println(ans-1);
    }

    public static void sol(int N, int r, int c){
        int row;
        int col;
        int lower = (int)Math.pow(2,N-1);

        if(N ==0){

            if (r == 0 && c == 0) ans += 1;
            else if (r == 0 && c == 1) ans += 2;
            else if (r == 1 && c == 0) ans += 3;
            else if (r == 1 && c == 1) ans += 4;
            return;
        }

        if(r >= lower){
            row = r - lower;
            if(c >=lower){
                col = c - lower;
                ans += 3*lower*lower;
                sol(N-1,row,col);
            }else{
                col = c;
                ans += 2*lower*lower;
                sol(N-1,row,col);
            }
        }else{
            row = r;
            if(c>=lower){
                col = c-lower;
                ans+= lower*lower;
                sol(N-1,row,col);
            }else{
                col = c;
                sol(N-1,row,col);
            }
        }
    }
}
