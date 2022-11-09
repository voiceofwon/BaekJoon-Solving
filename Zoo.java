import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zoo {
    static long dp[][] = new long[100001][3];
    static void find(int n){
        dp[1][0] =1;
        dp[1][1] = 1;
        dp[1][2] = 1;
        for(int i= 2;i<=n;i++){
            dp[i][0] = (dp[i-1][0]+dp[i-1][1]+dp[i-1][2])%9901;
            dp[i][1] = (dp[i-1][0]+dp[i-1][2])%9901;
            dp[i][2] = (dp[i-1][0]+dp[i-1][1])%9901;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        find(N);
        long result = dp[N][0]+dp[N][1]+dp[N][2];
        System.out.println(result%9901);
    }
}
