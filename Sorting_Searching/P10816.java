package Sorting_Searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//이진 탐색, Lower_bound, Upper_bound
//최종 출력 sout의 반복은 느리다. StringBuilder로 한번에 출력
public class P10816 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arrN = new int[N];
        for(int i=0;i<N;i++){
            arrN[i] = Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int[] arrM = new int[M];
        for(int i=0;i<M;i++){
            arrM[i] = Integer.parseInt(st2.nextToken());
        }
        Arrays.sort(arrN);
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<M;i++){
            sb.append(upper_bound(arrN, arrM[i]) - lower_bound(arrN, arrM[i]) +" ");

        }
        System.out.println(sb);


    }

    public static int lower_bound(int[] arr, int key){
        int mid;
        int lo =0, hi = arr.length;

        while(lo <hi){
            mid = (lo+hi)/2;
            if(arr[mid] >= key){
                hi = mid;
            }
            else{
                lo = mid+1;
            }
        }
        return lo;
    }

    public static int upper_bound(int[] arr, int key){
        int mid;
        int lo=0, hi= arr.length;

        while(lo<hi){
            mid = (lo+hi)/2;
            if(arr[mid] <= key){
                lo = mid +1;
            }
            else {
                hi = mid;
            }
        }
        return lo;
    }
}
