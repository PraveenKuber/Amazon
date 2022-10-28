package collections;

import java.util.*;

public class MapSortByValues {

    public static void main(String[] args) {
        Map<Integer,String> results = new HashMap<>();
        results.put(10,"Praveen");
        results.put(20,"Bindu");
        results.put(30,"Akash");
        results.put(40,"Kumar");
        results.put(60,"List");
        List<Map.Entry<Integer,String>> list = new LinkedList<>();
        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> integerStringEntry, Map.Entry<Integer, String> t1) {
                return 0;
            }
        });



        System.out.println(results);

    }
}
