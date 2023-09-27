package Sorting_Searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P7568{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        List<Student> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            list.add(new Student(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));

        }

        for(int i=0;i<N;i++){
            int rank = 0;
            Student temp = list.get(i);

            for(Student s : list){
                if(list.get(i) == s) continue;
                else{
                    if(temp.height < s.height && temp.weight < s.weight){
                        rank++;
                    }
                }
            }

            ans.add(rank +1);
        }

        for(int a : ans){
            System.out.print(a + " ");
        }
    }

    public static class Student{
        int weight;
        int height;
        public Student(int weight,int height){
            this.weight = weight;
            this.height = height;
        }
    }
}
