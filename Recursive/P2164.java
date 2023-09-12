package Recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//검색작업이 많을 시 ArrayList, 추가 삭제 작업 많을 시 LinkedList 사용하자.
public class P2164 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> list = IntStream.range(1, N + 1)
                .boxed()
                .collect(Collectors.toCollection(LinkedList::new));
        while(list.size()>1){
            list.poll();
            list.addLast(list.pollFirst());
        }

        System.out.println(list.poll());

    }
}
