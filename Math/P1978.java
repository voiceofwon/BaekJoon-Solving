package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P1978 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            list.add(Integer.parseInt(st.nextToken()));
        }

        int count =0;
        for(int a : list){
            boolean flag = true;
            if(a == 1) continue;
            if(a == 2){
                count++;
                continue;
            }
            for(int i=2;i<=Math.sqrt(a);i++){
                if(a%i ==0) flag = false;
            }

            if(flag) count++;
        }

        System.out.println(count);
    }
}
