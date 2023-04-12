package Dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P12865 {
    static int[][] dp =new int[101][100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input1 = br.readLine().split(" ");
        int N = Integer.parseInt(input1[0]);
        int K = Integer.parseInt(input1[1]);
        int[][] box = new int[N][2];
        for(int i =0;i<N;i++){
            String[] input2 = br.readLine().split(" ");
            box[i][0] = Integer.parseInt(input2[0]);
            box[i][1] = Integer.parseInt(input2[1]);
        }

        for(int i =1;i<=N;i++){
            for(int j =1;j<=K;j++){
                if(box[i-1][0] > j){
                    dp[i][j] = dp[i-1][j];
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j],box[i-1][1]+ dp[i-1][j-box[i-1][0]]);
                }
            }
        }

        System.out.println(dp[N][K]);
    }

}
