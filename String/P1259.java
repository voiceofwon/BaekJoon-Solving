package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class P1259 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = -1;
        List<String> ans = new LinkedList<>();
        while(true){
            String s = br.readLine();
            N = Integer.parseInt(s);
            if(N == 0) break;
            boolean flag = true;
            for(int i=0;i<s.length()/2;i++){
                if(s.charAt(i) == s.charAt(s.length()-i-1))
                    continue;
                else
                    flag = false;
            }

            if(flag){
                ans.add("yes");
            }else{
                ans.add("no");
            }



        }

        for(String s : ans){
            System.out.println(s);
        }
    }
}
