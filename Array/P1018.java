package Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1018 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[][] arr = new String[N][M];

        for(int i=0;i<N;i++){
            String temp = br.readLine();
            for(int j=0;j<M;j++){
                arr[i][j] = temp.charAt(j) +"";
            }
        }
        int count1 =0;
        int count2 =0;
        int ans =100;
        for(int i=0;i<=M-8;i++){
            for(int j=0;j<=N-8;j++){
                count1 =0;
                count2 =0;
                for(int k=j;k<j+8;k++){
                    for(int r =i;r<i+8;r++){
                        if(((k+r)%2 == 0 && arr[k][r].equals("W")) || ((k+r)%2 !=0 && arr[k][r].equals("B"))){
                            count1++;
                        }
                        else{
                            count2++;
                        }
                    }
                }
                ans = Math.min(64-count1,ans);
                ans = Math.min(64-count2,ans);
            }
        }

        System.out.println(ans);

    }
}
