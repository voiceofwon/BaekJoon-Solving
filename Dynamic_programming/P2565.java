package Dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P2565 {
    static int[] series = new int[501];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int a =0,b=0;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<N;i++){
            String[] input = br.readLine().split(" ");
            a= Integer.parseInt(input[0]);
            b=Integer.parseInt(input[1]);
            hashMap.put(a,b);
        }
        List<Integer> list = new ArrayList<>(hashMap.keySet());
        Collections.sort(list);
        for(int i =1;i<= hashMap.size();i++){
            series[i] = 1;
            for(int j = i-1; j>0;j--){
                if(hashMap.get(list.get(j-1)) < hashMap.get(list.get(i-1))){
                    series[i] = Math.max(series[j] + 1, series[i]);
                }
            }

        }
        Arrays.sort(series);
        System.out.println(hashMap.size()-series[500]);

    }
}
