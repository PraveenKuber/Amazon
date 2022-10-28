package collections;

import java.util.*;

public class ComparatorNew {

    public static void main(String[] args) {
        Map<String,String> stringStringMap = new HashMap<>();
        stringStringMap.put("sandeep","Zeee");
        stringStringMap.put("praveen","Vee");
        stringStringMap.put("bindu","ka");
        stringStringMap.put("thanushree","AAAA");

        System.out.println(stringStringMap);
        //Convert the map to list
        List<Map.Entry<String,String>> list = new LinkedList<>(stringStringMap.entrySet());

        //Sort the mao by values

        Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
            // t1    stringStringMap.put("sandeep","blr");
            // t2     stringStringMap.put("praveen","clk");
            @Override
            public int compare(Map.Entry<String, String> t1, Map.Entry<String, String> t2) {
                //blr,clk
                return t1.getValue().compareTo(t2.getValue());
            }
        });

        //Convert list to map

        Map<String,String> test = new LinkedHashMap<>();
        for(Map.Entry<String,String> stringMap:list){
            test.put(stringMap.getKey(),stringMap.getValue());
        }

        System.out.println(test);

    }
}
