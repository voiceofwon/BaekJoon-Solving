import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum_123_new {
    static long[] dp = new long[1000001];
    static void find(){

        dp[1] =1;
        dp[2] = 2;
        dp[3] = 4;
        for(int i=4; i<1000001;i++){
            dp[i] = (dp[i-1] + dp[i-2] + dp[i-3])%1000000009;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] n = new int[T+1];
        for(int i = 1; i<=T;i++){
            n[i] = Integer.parseInt(br.readLine());
        }
        find();
        for(int i=1; i<=T;i++){
            System.out.println(dp[n[i]]%1000000009);
        }

    }
}
