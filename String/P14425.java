package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class P14425 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input1 = br.readLine().split(" ");
        int N = Integer.parseInt(input1[0]);
        int M = Integer.parseInt(input1[1]);
        TreeSet<String> treeset = new TreeSet<>();
        for(int i =0;i<N;i++){
            treeset.add(br.readLine());
        }
        int count=0;
        for(int i=0;i<M;i++){
            if(treeset.contains(br.readLine())){
                count++;
            }
        }
        System.out.println(count);
    }
}
