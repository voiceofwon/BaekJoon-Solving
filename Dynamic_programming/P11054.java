package Dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P11054 {
    static int[] ascend = new int[1001];
    static int[] descend = new int[1001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] series = new int[N+1];
        for(int i=1;i<=N;i++){
            series[i] = Integer.parseInt(input[i-1]);
        }

        for(int i=1;i<=N;i++){
            ascend[i] = 1;
            for(int j = i-1;j>0;j--){
                if(series[j]<series[i]){
                    ascend[i] = Math.max(ascend[j] +1,ascend[i] );
                }

            }

        }
        for(int i = N;i>0;i--){
            descend[i] =1;
            for(int j =i+1; j<=N;j++){
                if(series[j] < series[i]){
                    descend[i] = Math.max(descend[i],descend[j]+1);
                }
            }
        }

        int[] result = new int[N+1];
        for(int i=1;i<=N;i++){
            result[i] = ascend[i] + descend[i] -1;
        }
        Arrays.sort(result);

        System.out.println(result[N]);


        
    }
}
