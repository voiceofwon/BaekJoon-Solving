package Sorting_Searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1654 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int arr[] = new int[K];
        long lo =0,hi =0,mid,count;
        for(int i=0;i<K;i++){
            arr[i] = Integer.parseInt(br.readLine());
            hi = (arr[i] > hi) ? arr[i] : hi;
        }
        hi+=1;
        while(lo<hi){
            mid = (lo+hi)/2;
            count =0;
            for(int i =0;i<K;i++){
                count += arr[i]/mid;
            }
            if(count >= N){
                lo =mid+1;
            }else{
                hi = mid;
            }
        }
        System.out.println(lo-1);
    }
}
