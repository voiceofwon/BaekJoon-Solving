package Math;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();
        int n = -1;
        while(true){
            n = Integer.parseInt(br.readLine());
            if(n ==0) break;

            q.add(count(2*n)-count(n));
        }
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }

    }
    public static int count(int n){
        int count =0;
        boolean[] arr = new boolean[n+1];
        double sqrt = Math.sqrt(n);
        for(int i = 2; i<=sqrt;i++){
            for(int j =2*i;j<=n;j=j+i){
                arr[j] = true;
            }
        }
        if(n >=1){
            arr[0] = true;
            arr[1] = true;
        }
        for(int i =0; i<=n;i++){
            if(arr[i] == false) count++;
        }

        return count;
    }
}
