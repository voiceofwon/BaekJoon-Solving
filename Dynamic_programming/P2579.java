package Dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2579 {
    static int[][] dp = new int[500][2];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] step = new int[N+1];
        step[0] = 0;
        for(int i=1;i<=N;i++){
            step[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(dp(N,step));
    }
    public static int dp(int n,int[] step){
        int k =0;
        dp[0][0] = 0;
        dp[0][1] =0;
        dp[1][0] = step[1];
        dp[1][1] = -1;
        for(int i =2; i<=n;i++){
            dp[i][0] = step[i] + Math.max(dp[i-2][0], dp[i-2][1]);
            dp[i][1] = step[i] + dp[i-1][0];
        }



        return Math.max(dp[n][0],dp[n][1]);
    }
}
