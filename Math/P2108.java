package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P2108 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        double sum  =0;
        int input;
        for(int i=0;i<N;i++){
            input = Integer.parseInt(br.readLine());
            sum += input;
            list.add(input);
            hashMap.put(input,hashMap.getOrDefault(input,0)+1);
        }

        double avg = sum/N;
        int AVG = (int) Math.round(avg);
        Collections.sort(list);
        int mid = list.get(N/2);
        int range = list.get(N-1) - list.get(0);
        list.clear();

        int max_mode =0;
        for(int key : hashMap.keySet()){
            max_mode = Math.max(hashMap.get(key),max_mode);
        }

        for(int key : hashMap.keySet()){
            if(hashMap.get(key) == max_mode)
                list.add(key);
        }

        Collections.sort(list);
        int Mode;
        if(list.size() >1){
            Mode = list.get(1);
        }else {
            Mode = list.get(0);
        }

        System.out.println(AVG);
        System.out.println(mid);
        System.out.println(Mode);
        System.out.println(range);
    }
}
