package Two_pointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P1644 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        boolean[] prime = prime(N);
        int[] series = new int[N+1];
        int k =0;
        for(int i=0;i<=N;i++){
            if(prime[i] == false){
                series[k++] =i;
            }
        }
        int s=0,e=0;
        int count =0;
        int sum =series[s];
        while(series[e] != 0 && e<N && s<=e){
            if(sum == N){
                count++;
                e++;
                sum+=series[e];
            }
            else if(sum>N){
                sum-=series[s];
                s++;
            }
            else{
                e++;
                sum+=series[e];
            }
        }
        System.out.println(count);

    }

    public static boolean[] prime(int N){
        boolean[] prime = new boolean[N+1];
        if(N>1){
            prime[0] = true;
            prime[1] = true;
        }
        for(int i =2;i<=Math.sqrt(N);i++){
            for(int j =i*2;j<=N;j=j+i){
                prime[j] = true;
            }
        }
        return prime;
    }
}
