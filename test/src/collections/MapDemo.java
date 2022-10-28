package collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<Integer,String> studentMap = new HashMap<>();
        studentMap.put(1,"BinduShree");
        studentMap.put(2,"Sandeep");
        studentMap.put(3,"ThanuShree");
        //Duplicate key added
        studentMap.put(2,"Praveen");
        //EntrySet having both key value pairs
        for(Map.Entry<Integer,String> testMap:studentMap.entrySet()){
            System.out.println("Key ::::"+testMap.getKey()+"::::: Value :::::"+testMap.getValue());
        }

        String name = studentMap.get(10);
        System.out.printf("Name is ::::::"+name);
    }
}
