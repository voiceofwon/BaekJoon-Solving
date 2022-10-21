import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Power_Sum {
    static int dp[] = new int[100001];
    static int find(int n){
        for(int i=1; i<=n;i++){
            dp[i] = i;
            for(int j =1;j*j <=i;j++){
                if(dp[i]>dp[i-j*j]+1){
                    dp[i] =dp[i-j*j]+1;
                }
            }
        }
        return dp[n];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(find(N));
    }
}
