import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Brute_Force {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] n = new int[9];
        for(int i = 0; i<9;i++){
            n[i] = Integer.parseInt(br.readLine());
        }
        int sum = 0;
        int a =-1;
        int b = -1;

        for(int i = 0;i<9;i++){
            for(int j = 1; j<9;j++){
                for(int k =0;k<9;k++){
                    if(k != i && k != j)
                        sum += n[k];

                }
                if(sum == 100){
                    a = i;
                    b= j;
                    break;
                }
                else sum =0;
            }
        }
        int[] ans = new int[7];
        int k =0;
        for(int i = 0; i<9;i++){
            if(i != a && i !=b)
                ans[k++] = n[i];
        }
        int find = 100;
        int idx = -1;
        int temp = -1;
        for(int i =0;i<7;i++){
            for(int j =i+1;j<7;j++){
                if(ans[i]>ans[j] && find > ans[j]) {
                    find = ans[j];
                    idx = j;
                }
            }
            if(find <100){
                temp = ans[i];
                ans[i] = ans[idx];
                ans[idx] = temp;
            }
            find = 100;
        }

        for(int i =0; i<7;i++){
            System.out.println(ans[i]);
        }
    }
}
