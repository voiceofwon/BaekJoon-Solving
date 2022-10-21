import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Count_Stair {
    static long dp[][] = new long[101][10];
    static void find(int n){
        for(int i =1;i<10;i++){
            dp[1][i] =1;
        }
        dp[2][0] =1;
        dp[2][1] = 1;
        dp[2][2] =2;
        dp[2][3] =2;
        dp[2][4] =2;
        dp[2][5] =2;
        dp[2][6] =2;
        dp[2][7] =2;
        dp[2][8] =2;
        dp[2][9] =1;
        for(int i =3; i<=n; i++){
            dp[i][0] = dp[i-1][1]%1000000000;
            dp[i][1] = (dp[i-1][0]+dp[i-1][2])%1000000000;
            dp[i][2] = (dp[i-1][1]+dp[i-1][3])%1000000000;
            dp[i][3] = (dp[i-1][2]+dp[i-1][4])%1000000000;
            dp[i][4] = (dp[i-1][3]+dp[i-1][5])%1000000000;
            dp[i][5] = (dp[i-1][4]+dp[i-1][6])%1000000000;
            dp[i][6] = (dp[i-1][5]+dp[i-1][7])%1000000000;
            dp[i][7] = (dp[i-1][6]+dp[i-1][8])%1000000000;
            dp[i][8] = (dp[i-1][7]+dp[i-1][9])%1000000000;
            dp[i][9] = (dp[i-1][8])%1000000000;
        }
    }
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        find(N);
        int k =0;
        for(int i = 0; i<10;i++){
            k += dp[N][i];
            k %= 1000000000;
        }
        System.out.println(k%1000000000 + "");
    }
}
