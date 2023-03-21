package Two_pointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1450 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int C = Integer.parseInt(input[1]);
        int[] series = new int[N];
        String[] input2 = br.readLine().split(" ");
        for(int i=0;i<N;i++){
            series[i] = Integer.parseInt(input2[i]);
        }

        int s=0,e=0;
        int sum =series[s];
        int count =1;//아무것도 안넣는 경우
        Arrays.sort(series);
        while(e<N && s<=e){
            if(sum <= C){
                count++;
                e++;
                if(e<N)
                    sum+=series[e];
            }
            else{
                sum-=series[s];
                s++;
            }
        }
        System.out.println(count);

    }
}
