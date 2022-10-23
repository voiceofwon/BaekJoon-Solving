import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sum_Decomposition {
    static long[][] dp = new long[201][201];
    static void find(int n,int k){
        int max = n>=k ? n:k;
        for(int i = 1;i<=max;i++){
            dp[i][1] = 1;
            dp[0][i] =1;
        }
        for(int i =1;i<=n;i++){
            for(int j =2; j<=k;j++){
                for(int m =0;m<=i;m++){
                    dp[i][j] +=dp[i-m][j-1]%1000000000;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        find(N,K);
        System.out.println(dp[N][K]%1000000000);
    }
}
