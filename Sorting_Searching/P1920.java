package Sorting_Searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class P1920 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        TreeSet<Integer> given = new TreeSet<>();
        st = new StringTokenizer(br.readLine());
        for(int i =0;i<N;i++){
            given.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            if(given.contains(Integer.parseInt(st.nextToken())))
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
