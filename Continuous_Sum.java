import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Continuous_Sum {
    static int[] dp = new int[100001];
    static int find(int[] A,int n){
        dp[1] = A[1];
        int sum =0;
        int max =A[1];
        for(int i=2; i<=n;i++){
            dp[i] = Math.max(dp[i-1] + A[i], A[i]);
            max = Math.max(max,dp[i]);
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[100001];
        for(int i =1; i<=n; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(find(A,n));

    }
}
