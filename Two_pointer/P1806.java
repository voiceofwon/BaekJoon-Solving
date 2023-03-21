package Two_pointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1806 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int S = Integer.parseInt(input[1]);
        String[] arr = br.readLine().split(" ");
        int[] series = new int[N];
        for(int i =0;i<N;i++){
            series[i] = Integer.parseInt(arr[i]);
        }
        int s=0, e=0;
        int sum = series[s];
        int min = N+1;
        while(e<N && s<=e){
            if(sum < S){
                e++;
                if(e <N)
                sum+=series[e];
            }else{
                min = Math.min(min,e-s+1);
                sum-= series[s];
                s++;
            }
        }
        if(min == N+1) min =0;
        System.out.println(min);
    }
}
