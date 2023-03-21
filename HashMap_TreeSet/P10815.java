package HashMap_TreeSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class P10815 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input2 = br.readLine().split(" ");
        TreeSet<Integer> treeset = new TreeSet<>();
        for(int i=0;i<N;i++){
            treeset.add(Integer.parseInt(input2[i]));
        }
        int M = Integer.parseInt(br.readLine());
        String[] input4 = br.readLine().split(" ");
        int[] prob = new int[M];
        for(int i=0;i<M;i++){
            if(treeset.contains(Integer.parseInt(input4[i])))
                prob[i] = 1;
            else
                prob[i] = 0;
        }

        for(int i=0;i<M;i++)
            System.out.print(prob[i]+" ");

    }
}
