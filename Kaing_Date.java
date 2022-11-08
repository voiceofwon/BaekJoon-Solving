import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Kaing_Date {
    static int count(int N, int M,int a,int b){
        int x = a-1;
        int y = b-1;
        for(int i = x;i<(N*M);i+=N){
            if(i%M +1 ==b) return i+1;
        }
        return -1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] result = new int[T];
        StringTokenizer st;
        for(int i =0;i<T;i++){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            result[i] = count(N,M,x,y);
        }
        for(int i =0;i<T;i++){
            System.out.println(result[i]);
        }
    }
}
