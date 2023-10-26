package Tree_Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1389 {
    static int[][] rel;
    static int N;
    static int M;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        List<Integer> kevin = new ArrayList<>();

        rel = new int[N+1][N+1];

        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                rel[i][j] = 9000000;
            }
        }

        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            rel[a][b] = 1;
            rel[b][a] = 1;
        }

        for(int k=1;k<=N;k++){
            for(int i=1;i<=N;i++){
                for(int j=1;j<=N;j++){
                    if(rel[i][k]+rel[k][j] < rel[i][j]){
                        rel[i][j] = rel[i][k]+rel[k][j];
                    }
                }
            }
        }
        int idx =-1;
        int temp =0;
        int count = Integer.MAX_VALUE;
        for(int i=1;i<=N;i++){
            temp =0;
            for(int j=1;j<=N;j++){
                if(i==j) continue;

                temp += rel[i][j];
            }
            if(temp < count){
                count = temp;
                idx =i;
            }
        }

        System.out.println(idx);

    }

}
