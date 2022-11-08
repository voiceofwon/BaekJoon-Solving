import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Counting_Num {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Integer.parseInt(br.readLine());
        long h = 1;
        long result = 0;
        long temp_n = N;
        while(temp_n / 10 != 0) {
            h++;
            temp_n /= 10;
        }
        for(int i =1;i<=h-1;i++){
            result += i*(Math.pow(10,i) - Math.pow(10,i-1));
        }
        long count_num = N - (int)Math.pow(10,h-1)+1;
        if(N<10) count_num = N;
        result += h*count_num;

        System.out.println(result);
    }
}
