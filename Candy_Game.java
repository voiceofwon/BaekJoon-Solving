import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Candy_Game {
    static int max =0;
    static int N;
    static void arrCheck(char[][] arr){
        for(int i=0;i<N;i++){
            int count =1;
            for(int j=0;j<N-1;j++){
                if(arr[i][j] == arr[i][j+1]) count++;
                else count =1;

                max = Math.max(max,count);
            }
        }
        for(int i=0;i<N;i++){
            int count =1;
            for(int j=0;j<N-1;j++){
                if(arr[j][i] == arr[j+1][i]) count++;
                else count =1;

                max = Math.max(max,count);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        char[][] arr = new char[N][N];
        char[][] comp = new char[N][N];
        for(int i =0;i<N;i++){
            arr[i] = br.readLine().toCharArray();
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<N-1;j++){
                char temp = arr[i][j];
                arr[i][j] = arr[i][j+1];
                arr[i][j+1] = temp;

                arrCheck(arr);

                temp = arr[i][j];
                arr[i][j] = arr[i][j+1];
                arr[i][j+1] = temp;
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N-1;j++){
                char temp = arr[j][i];
                arr[j][i] = arr[j+1][i];
                arr[j+1][i] = temp;

                arrCheck(arr);

                temp = arr[j][i];
                arr[j][i] = arr[j+1][i];
                arr[j+1][i] = temp;
            }
        }
        System.out.println(max);
    }
}
