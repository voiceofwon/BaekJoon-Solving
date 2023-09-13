package Sorting_Searching;

import java.io.*;
import java.util.*;

public class P10814 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        List<Member> memberList = new LinkedList<>();

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            memberList.add(new Member(age,name));
        }


        //Collecions의 sort는 합병정렬로 안정성을 보장한다.
        Collections.sort(memberList, (o1,o2) -> o1.age -o2.age);

        for(Member m : memberList){
            bw.write(m.age + " " + m.name + "\n");
        }

        bw.flush();
        bw.close();
    }

    public static class Member{
        int age;
        String name;
        public Member(int age, String name){
            this.age =age;
            this.name = name;
        }
    }
}
