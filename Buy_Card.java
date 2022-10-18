import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Buy_Card {
    static int dp[] = new int[1001];
    static void find(int n[],int P){
        dp[0] = 0;
        dp[1] = n[0];
        for(int i = 2; i<=P;i++){
            dp[i] = n[i-1];
            for(int j = 1;j<=i;j++){
                dp[i] = Math.min(n[j-1]+dp[i-j],dp[i]);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int P = Integer.parseInt(br.readLine());
        int n[] = new int[P];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<P;i++){
            n[i] = Integer.parseInt(st.nextToken());
        }
        find(n,P);
        System.out.println(dp[P] + "");
    }
}
