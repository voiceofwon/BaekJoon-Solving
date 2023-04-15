package Sorting_Searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//이진탐색
public class P2805 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        long M = Integer.parseInt(st.nextToken());
        long lo= 0,hi =0,mid,count;
        long[] arr = new long[N];
        st = new StringTokenizer(br.readLine());
        for(int i =0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            hi = (arr[i] >hi) ? arr[i] :hi;
        }
        hi+=1;
        while(lo<hi){
            mid = (lo+hi)/2;
            count =0;
            for(int i=0;i<N;i++){
                if(arr[i] >mid)
                    count += arr[i]-mid;
            }

            if(count >= M){
                lo = mid+1;
            }else {
                hi =mid;
            }
        }

        System.out.println(lo-1);

    }


}
