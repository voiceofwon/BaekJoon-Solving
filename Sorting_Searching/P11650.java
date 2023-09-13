package Sorting_Searching;

import java.io.*;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class P11650 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        List<point> pointList = new LinkedList<>();

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            pointList.add(new point(x,y));
        }

        Collections.sort(pointList,(o1,o2) -> {
            if(o1.x == o2.x) return o1.y - o2.y;
            else return o1.x-o2.x;
        });

        for(point p : pointList){
            bw.write(p.x + " " + p.y +"\n");
        }

        bw.flush();
        bw.close();
    }

    public static class point{
        int x;
        int y;
        public point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
