import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Two_N {
    static int dp[] = new int[1001];
    static void find(int n){
        dp[0] =0;
        dp[1] =1;
        dp[2] = 3;
        for(int i =3; i<n+1;i++){
            dp[i] = (dp[i-1]+2*dp[i-2])%10007;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        find(n);
        System.out.println(dp[n]+"");

    }
}
