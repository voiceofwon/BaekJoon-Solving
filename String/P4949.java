package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class P4949 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> ans = new ArrayList<>();
        Stack<Character> in = new Stack<>();
        Stack<Character> check = new Stack<>();
        while(true){
            String input = br.readLine();
            int small_s =0;
            int small_e =0;
            int big_s =0;
            int big_e = 0;
            if(input.equals(".")) break;

            for(int i=0;i<input.length();i++){
                if(input.charAt(i) == '(' || input.charAt(i) == ')'
                        || input.charAt(i) == '[' || input.charAt(i) == ']') in.push(input.charAt(i));

            }

            boolean istrue = true;

            while(!in.isEmpty()){
                if(in.peek() == ')' || in.peek() == ']') check.push(in.pop());
                else if(in.peek() == '('){
                    if(check.isEmpty()){

                        ans.add("no");
                        istrue = false;
                        break;
                    }
                    else if(check.peek() == ')') {
                        in.pop();
                        check.pop();
                    }
                    else{
                        ans.add("no");
                        istrue = false;
                        break;
                    }
                }
                else if(in.peek() == '['){
                    if(check.isEmpty()){

                        ans.add("no");
                        istrue = false;
                        break;
                    }
                    else if(check.peek() == ']') {
                        in.pop();
                        check.pop();
                    }
                    else{
                        ans.add("no");
                        istrue = false;
                        break;
                    }
                }
            }

            if(!check.isEmpty() && istrue){
                ans.add("no");
            }
            else if(istrue) {

                ans.add("yes");
            }

            in.clear();
            check.clear();


        }

        for(String a : ans){
            System.out.println(a);
        }
    }
}
