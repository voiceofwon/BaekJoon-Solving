package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1735 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] fir = br.readLine().split(" ");
        int A1 = Integer.parseInt(fir[0]);
        int B1 = Integer.parseInt(fir[1]);
        String[] sec = br.readLine().split(" ");
        int A2 = Integer.parseInt(sec[0]);
        int B2 = Integer.parseInt(sec[1]);
        sum(A1,B1,A2,B2);



    }

    public static void sum(int a1,int b1, int a2, int b2){
        int numerator = a1 * b2 + a2 * b1;
        int denominator = b1 * b2;
        int min = (numerator > denominator) ? denominator : numerator;
        int max = (numerator > denominator) ? numerator : denominator;
        int gcd = gcd(min, max);
        System.out.println(numerator/gcd + " " + denominator/gcd);
    }
    public static int gcd(int min, int max){
        if(max%min ==0){
            return min;
        }
        return gcd(max%min, min);
    }
}
