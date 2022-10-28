package collections;

import java.util.*;

public class MapDemo2 {
    private Map<String,Integer> input;

    public static void main(String[] args) {
        Map<String,Integer> input = new HashMap<>();
        input.put("bindu",10);
        input.put("bindu1",1);
        input.put("bindu2",2);
        input.put("bind3",4);

        System.out.println(input);


        //For sorting map we need use , comparator
        //1.Convert the map to List
        List<Map.Entry<String,Integer>> list = new LinkedList<>(input.entrySet());
        //Map.Entry<String,Integer> type
        //List<Something>
        boolean type= false;

        //Sort

        if(type==true){
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                public int compare(Map.Entry<String, Integer> stringIntegerEntry, Map.Entry<String, Integer> t1) {
                    return (stringIntegerEntry.getValue().compareTo(t1.getValue()));
                }
            });
        }else{
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                @Override
                //10,4
                //10
                public int compare(Map.Entry<String, Integer> stringIntegerEntry, Map.Entry<String, Integer> t1) {
                    return (t1.getValue().compareTo(stringIntegerEntry.getValue()));
                }
            });
        }


        //10,4,1,2
        //

        //
        Map<String,Integer> result = new LinkedHashMap<>();
        for(Map.Entry<String,Integer> res:list){
            result.put(res.getKey(),res.getValue());
        }

        System.out.println("Final::::"+result);


        //Sort the map by values
        //1.Convert the map to list
        //2.Collections of sort by comparator in compare // i1,i2 compareTO
        //3.Convert list to map

    }
}
