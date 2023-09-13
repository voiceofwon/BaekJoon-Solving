package Sorting_Searching;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class P11866 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int flag = K-1;
        List<Integer> list = IntStream.range(1,N+1)
                .boxed()
                .collect(Collectors.toCollection(LinkedList::new));

        List<Integer> answer = new ArrayList<>();

        while(!list.isEmpty()){
            answer.add(list.remove(flag));
            if(!list.isEmpty())
                flag = (flag + K-1) % list.size();
        }

        int size = (answer+"").length();
        bw.write("<" + (answer + "").substring(1,size-1) + ">");

        bw.flush();
        bw.close();
    }
}
