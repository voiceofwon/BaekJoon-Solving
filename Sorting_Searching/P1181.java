package Sorting_Searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1181 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        TreeSet<String> input = new TreeSet<>();
        for(int i=0;i<N;i++){
            input.add(br.readLine());
        }
        String[] arr = input.toArray(new String[input.size()]);
        Arrays.sort(arr, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                if(o1.length() != o2.length()) return o1.length()-o2.length();
                else return o1.compareTo(o2);
            }
        });
        for(int i =0;i<input.size();i++){
            System.out.println(arr[i]);
        }
    }
}
