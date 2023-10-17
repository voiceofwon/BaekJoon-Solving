package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P18111 {

    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;

    static int time =0;
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                min = Math.min(arr[i][j],min);
                max = Math.max(arr[i][j],max);
            }
        }
        int gap =0;
        long remain =0;
        int result = Integer.MAX_VALUE;
        int floor = 0;
        for(int i = min;i<=max;i++){
            remain = B;
            time =0;
            for(int j=0;j<N;j++){
                for(int k=0;k<M;k++){
                    if(arr[j][k] > i){
                        gap = arr[j][k] -i;
                        time += 2*gap;
                        remain +=gap;
                    }else if(arr[j][k] <i){
                        gap = i - arr[j][k];
                        remain -=gap;
                        time +=gap;
                    }
                }
            }
            if(remain >=0){
                if(time <= result){
                    result = time;
                    floor = i;
                }

            }
        }

        System.out.println(result + " " + floor);
    }
}
