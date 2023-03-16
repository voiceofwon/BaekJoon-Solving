package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[20];
        String[][] save = new String[20][3];
        double sum_grade = 0;
        double sum_max = 0;
        double total =0;
        for(int i =0; i<20;i++){
            arr[i] = br.readLine();
            save[i] = arr[i].split(" ");
        }
        for(int j =0; j<20;j++){
            if(grade(save[j][2]) != -1) {
                sum_max += Double.parseDouble(save[j][1]);
                sum_grade += grade(save[j][2]);
                total +=Double.parseDouble(save[j][1]) *grade(save[j][2]);
            }
        }
        if(sum_max == 0) System.out.println(0);
        else System.out.println(String.format("%.6f",total/sum_max));


    }
    public static double grade(String a){
        double grade = -1;
        if(a.equals("A+")) grade = 4.5;
        else if (a.equals("A0")) grade = 4.0;
        else if(a.equals("B+")) grade =3.5;
        else if(a.equals("B0")) grade = 3.0;
        else if(a.equals("C+")) grade = 2.5;
        else if(a.equals("C0")) grade = 2.0;
        else if(a.equals("D+")) grade= 1.5;
        else if(a.equals("D0")) grade = 1.0;
        else if(a.equals("F")) grade =0;
        else if(a.equals("P")) grade =-1;
        return grade;
    }
}
