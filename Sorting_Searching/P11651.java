package Sorting_Searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P11651 {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        List<point> list = new LinkedList<>();

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            list.add(new point(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));

        }

        Collections.sort(list, new Comparator<point>() {
            @Override
            public int compare(point o1, point o2) {
                if(o1.y != o2.y) return o1.y - o2.y;
                else{
                    return o1.x - o2.x;
                }
            }
        });

        for(point p : list){
            sb.append(p.x + " "+p.y +"\n");
        }

        System.out.println(sb);

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
