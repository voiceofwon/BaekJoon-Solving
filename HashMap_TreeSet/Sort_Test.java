package HashMap_TreeSet;

import java.io.IOException;
import java.util.*;

public class Sort_Test {
    public static void main(String[] args) throws IOException{
        HashMap<String,Integer> map = new HashMap<>();

        map.put("c",1);
        map.put("B",2);
        map.put("a",3);
        map.put("A",4);

        List<Map.Entry<String,Integer>> entryList = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());


        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return 0;
            }
        });
        /*Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });*/

        System.out.println("오름차순 정렬");

        for(Map.Entry<String,Integer> entry :entryList){
            System.out.println(entry.getKey() +" : " +entry.getValue());
        }

        TreeMap<String, Integer> map1 = new TreeMap<>();

        map.put("c",1);
        map.put("B",2);
        map.put("a",3);
        map.put("A",4);

        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() +" : " +entry.getValue());
        }

        TreeSet<Integer> set = new TreeSet<Integer>(Collections.reverseOrder());

        set.add(80);
        set.add(70);
        set.add(90);
        set.add(90);

        Object[] a = set.toArray();

        for(Object i : a){
            System.out.println(i +" ");
        }
    }
}
