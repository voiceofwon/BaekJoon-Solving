import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Puzzle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] num = new int[N][M];
        int max = 0;
        for(int i =0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j =0;j<M;j++){
                num[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i =0;i<N;i++){
            for(int j =0;j<M-3;j++){
                max = Math.max(max,num[i][j]+num[i][j+1]+num[i][j+2]+num[i][j+3]);
            }
        }
        for(int i =0;i<N-3;i++){
            for(int j =0;j<M;j++){
                max = Math.max(max,num[i][j]+num[i+1][j]+num[i+2][j]+num[i+3][j]);
            }
        }
        for(int i =0;i<N-1;i++){
            for(int j =0;j<M-1;j++){
                max = Math.max(max,num[i][j]+num[i][j+1]+num[i+1][j]+num[i+1][j+1]);
            }
        }
        for(int i =0;i<N-1;i++){
            for(int j=0;j<M-2;j++){
                max = Math.max(max,num[i][j]+num[i][j+1]+num[i][j+2]+num[i+1][j]);
                max = Math.max(max,num[i][j]+num[i][j+1]+num[i][j+2]+num[i+1][j+2]);
                max = Math.max(max,num[i][j]+num[i+1][j]+num[i+1][j+1]+num[i+1][j+2]);
                max = Math.max(max,num[i+1][j]+num[i+1][j+1]+num[i+1][j+2]+num[i][j+2]);
                max = Math.max(max,num[i][j+1]+num[i+1][j+1]+num[i][j+2]+num[i+1][j]);
                max = Math.max(max,num[i][j+1]+num[i+1][j+1]+num[i][j]+num[i+1][j+2]);
                max = Math.max(max,num[i][j]+num[i][j+1]+num[i][j+2]+num[i+1][j+1]);
                max = Math.max(max,num[i][j+1]+num[i+1][j]+num[i+1][j+1]+num[i+1][j+2]);
            }
        }
        for(int i =0;i<N-2;i++){
            for(int j =0;j<M-1;j++){
                max = Math.max(max,num[i][j]+num[i+1][j]+num[i+2][j]+num[i][j+1]);
                max = Math.max(max,num[i][j]+num[i+1][j]+num[i+2][j]+num[i+2][j+1]);
                max = Math.max(max,num[i][j+1]+num[i+1][j+1]+num[i+2][j+1]+num[i][j]);
                max = Math.max(max,num[i][j+1]+num[i+1][j+1]+num[i+2][j+1]+num[i+2][j]);
                max = Math.max(max,num[i+1][j]+num[i+1][j+1]+num[i][j]+num[i+2][j+1]);
                max = Math.max(max,num[i+1][j]+num[i+1][j+1]+num[i][j+1]+num[i+2][j]);
                max = Math.max(max,num[i][j]+num[i+1][j]+num[i+2][j]+num[i+1][j+1]);
                max = Math.max(max,num[i][j+1]+num[i+1][j+1]+num[i+2][j+1]+num[i+1][j]);
            }
        }
        System.out.println(max);


    }
}
