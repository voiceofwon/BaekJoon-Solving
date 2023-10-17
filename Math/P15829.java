package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P15829 {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        br.readLine();
        System.out.println(hash(br.readLine()));
    }

    public static long hash(String in){
        long sum =0;
        char[] arr = in.toCharArray();
        long flag = 0;

        for(char a : arr){
            long temp = a -'a' +1;
            temp = (long) (temp * power(31, flag) % 1234567891);
            sum = (sum + temp)%1234567891;
            flag++;


        }


        return sum;
    }

    public static long power(long a, long b){
        long result = 1;
        for(int i =0;i<b;i++){
            result = result * a %1234567891;
        }
        return result;
    }
}
