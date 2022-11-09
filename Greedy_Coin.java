import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Greedy_Coin {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] A = new int[N];
        for(int i =0;i<N;i++){
            A[i] = Integer.parseInt(br.readLine());
        }
        int count =0;
        int flag = N-1;
        while(K != 0){
            while ((A[flag] > K)) {
                if(flag-1 >=0)
                flag--;
            }
            count++;
            K -= A[flag];
        }
        System.out.println(count);

    }
}
