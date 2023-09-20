package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11050 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long N = Integer.parseInt(st.nextToken());
        long K = Integer.parseInt(st.nextToken());


        System.out.println(fac(N)/(fac(K) * fac(N-K)));
    }
    public static long fac(long N){
        long ans = 1L;
        if(N == 1) return 1L;
        else{
                for(long i = N;i>1;i--){
                    ans *=i;
                }
                return ans;
        }
    }
}
