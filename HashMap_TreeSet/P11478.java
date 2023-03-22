package HashMap_TreeSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class P11478 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        TreeSet<String> treeSet = new TreeSet<>();
        for(int i=0;i<S.length();i++){
            for(int j=i+1;j<=S.length();j++){
                if(!treeSet.contains(S.substring(i,j))) treeSet.add(S.substring(i,j));
            }
        }
        System.out.println(treeSet.size());
    }
}
