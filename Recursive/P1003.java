package Recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1003 {
    static int[][] dp = new int[41][2];
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] input = new int[T];
        for(int i =0;i<T;i++){
            input[i] = Integer.parseInt(br.readLine());
        }


        sol();

        for(int i=0;i<T;i++){
            System.out.println(dp[input[i]][0] + " "+dp[input[i]][1]);
        }


    }
    public static void sol(){
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] =0;
        dp[1][1] = 1;

        for(int i =2;i<41;i++){
            dp[i][0] = dp[i-1][0] + dp[i-2][0];
            dp[i][1] = dp[i-1][1] + dp[i-2][1];
        }
    }
}
