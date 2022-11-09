import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rising_Num {
    static long[][] dp = new long[1001][10];
    static void find(int n){
        for(int i=0;i<10;i++){
            dp[1][i] =1;
        }
        for(int i =2;i<=n;i++){
            for(int j=0;j<10;j++){
                for(int k =0;k<=j;k++){
                    dp[i][j] += dp[i-1][k]%10007;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        find(N);
        int result = 0;
        for(int i =0;i<10;i++){
            result += dp[N][i]%10007;
        }
        System.out.println(result%10007);
    }
}
