import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum_123 {
    static long dp[][] = new long[100001][4];
    static void find(){
        dp[1][1] =1;
        dp[2][2] =1;
        dp[3][1] = 1;
        dp[3][2] = 1;
        dp[3][3] = 1;
        for(int i = 4; i<100001;i++){
            dp[i][1] = (dp[i-1][2] +dp[i-1][3])%1000000009;
            dp[i][2] = (dp[i-2][1] + dp[i-2][3])%1000000009;
            dp[i][3] = (dp[i-3][2] + dp[i-3][1])%1000000009;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int n[] = new int[T];
        for(int j = 0; j<T;j++){
            n[j] = Integer.parseInt(br.readLine());
        }
        find();
        for(int j = 0;j<T; j++){
            System.out.println((dp[n[j]][1] + dp[n[j]][2] + dp[n[j]][3])%1000000009+"");
        }
    }
}
