package collections;

import java.util.ArrayList;

public class CheckConcurrent {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);
        //add
        arrayList.add(60);

        //remove
        arrayList.remove(arrayList.size());

        for(Integer value:arrayList){
            System.out.println("Value:::::"+value);
            //arrayList.remove(value);
        }


        //Index 0  1  2  3
        //Value 11 12 13
    }
}
