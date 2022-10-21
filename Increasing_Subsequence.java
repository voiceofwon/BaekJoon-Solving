import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Increasing_Subsequence {
    static long[] dp = new long[1001];
    static long max = 1;

    static long find(int n, int A[]){


        for(int i =0; i<n;i++){
            dp[i] =1;
            for(int j= 0;j<i;j++){
                if(A[j] < A[i] && dp[i] < dp[j]+1){
                    dp[i] =dp[j] +1;
                }
            }
            if(dp[i] > max) {
                max = dp[i];
            }
        }
        return max;
    }





    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] A = new int[N];
        for(int i =0; i<N;i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        int k = (int)find(N,A);
        System.out.println(k);

        Stack<Integer> stack = new Stack<>();

        for(int i=A.length-1;i>=0;i--){
            if(k == dp[i]){
                stack.push(A[i]);
                k--;
            }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }



    }
}
