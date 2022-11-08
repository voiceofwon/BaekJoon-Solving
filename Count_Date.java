import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Count_Date {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int N = 7980;
        if(E % 15 == 0) E =0;
        if(S % 28 == 0) S =0;
        if(M % 19 == 0) M =0;

        for(int i =N;i>0;i--){
            if(i%15 ==E && i%28 == S && i%19 == M) {
                System.out.println(i);
                break;
            }

        }
    }
}
