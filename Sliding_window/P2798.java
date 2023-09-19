package Sliding_window;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P2798 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            list.add(Integer.parseInt(st.nextToken()));
        }

        int sum =0;
        boolean flag = false;
        int ans =-1;
        for(int i=0;i<N-2;i++){
            int s =i;
            for(int j =i+1;j<N-1;j++){
                int m = j;
                for(int k =j+1;k<N;k++){
                    int e = k;
                    sum = list.get(s) + list.get(m)+list.get(e);
                    if(sum < M && sum > ans){
                        ans = sum;
                        sum=0;
                        continue;
                    }
                    if(sum == M){
                        ans= sum;
                        sum =0;
                        flag = true;
                        break;
                    }
                    if(sum>M){
                        sum =0;
                        continue;
                    }
                }
                if(flag) break;

            }
            if(flag) break;
        }

        System.out.println(ans);


    }
}
