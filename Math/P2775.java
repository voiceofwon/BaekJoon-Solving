package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P2775 {
    static int[][] dp = new int[15][15];
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        sol();
        int T = Integer.parseInt(br.readLine());
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<T;i++){
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            ans.add(dp[k][n]);
        }

        for(int a : ans){
            System.out.println(a);
        }
    }

    public static void sol(){
        for(int i=0;i<15;i++){
            dp[0][i] =i;
        }
        int temp =0;
        for(int i =1;i<15;i++){
            for(int j =1;j<15;j++){
                temp = 0;
                for(int m =1;m<=j;m++){

                    temp += dp[i-1][m];
                }
                dp[i][j] = temp;
            }
        }
    }
}
