package Sorting_Searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class P10989 {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        int[] count = new int[10001];
        for(int i=0;i<N;i++){
            count[Integer.parseInt(br.readLine())]++;
        }

        for(int i =0;i<10001;i++){
            while(count[i] !=0){
                sb.append(i+"\n");
                count[i]--;
            }
        }

        System.out.println(sb);

    }
}
