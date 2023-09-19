package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P4153 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        List<String> ans = new ArrayList<>();

        while(a != 0 || b !=0 || c !=0 ){
            if((a*a) == (b*b) + (c*c) || (c*c) == (a*a) + (b*b) ||(b*b) == (a*a) + (c*c)){
                ans.add("right");
            }
            else{
                ans.add("wrong");
            }
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
        }

        for(String e : ans){
            System.out.println(e);
        }
    }
}
