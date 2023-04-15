package Sorting_Searching;

import com.sun.source.tree.Tree;

import java.io.*;
import java.util.Iterator;
import java.util.TreeSet;

public class P2751 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        TreeSet<Integer> ts =new TreeSet<>();
        int N = Integer.parseInt(br.readLine());
        for(int i=0;i<N;i++){
            ts.add(Integer.parseInt(br.readLine()));
        }
        Iterator iter = ts.iterator();
        while(iter.hasNext()){
            bw.write(iter.next() +"\n");
        }

        bw.flush();
        bw.close();
    }
}
