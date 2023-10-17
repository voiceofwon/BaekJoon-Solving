package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P18110 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[31];
        int n = Integer.parseInt(br.readLine());
        int least = (int) Math.round(n*0.15);
        int max = n-least;

        int total = n - least*2;
        int sum =0;
        int flag = 1;
        for(int i=0;i<n;i++){
            arr[Integer.parseInt(br.readLine())]++;
        }
        for(int i=0;i<n;i++){
            for(int j = 1;j<31;j++){

                if(arr[j] !=0){
                    if (flag <= max && flag > least) {
                        sum+=j;
                        arr[j]--;
                        flag++;
                        break;
                    }else{
                        arr[j]--;
                        flag++;
                        break;
                    }
                }
            }
        }
        System.out.println(least + " : least");
        System.out.println(max + " : max");
        System.out.println(total + " : total");
        System.out.println((float)sum/total + " : sum/total");

        if(total !=0){
            System.out.println(Math.round((float)sum/total));

        }
        else{
            System.out.println(0);
        }




    }
}
