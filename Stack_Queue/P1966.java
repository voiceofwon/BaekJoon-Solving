package Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P1966 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        LinkedList<int[]> q = new LinkedList<>();
        int K = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N,M,count;
        for(int i=0;i<K;i++){
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            count =0;
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<N;j++){
                q.add(new int[]{j,Integer.parseInt(st.nextToken())});
            }

            while(!q.isEmpty()){
                boolean isMax = true;
                int first = q.get(0)[1];
                for(int k=1;k<q.size();k++){
                    if(q.get(k)[1] > first){
                        isMax = false;
                    }
                }

                if(isMax){
                    int flag = q.poll()[0];
                    count++;
                    if(flag == M){
                        sb.append(count + "\n");
                        break;
                    }
                }else{
                    q.offer(q.poll());
                }

            }
            q.clear();
        }
        System.out.println(sb);
    }
}
