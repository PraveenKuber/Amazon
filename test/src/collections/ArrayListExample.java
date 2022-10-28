package collections;


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

    public static void main(String[] args) {
        //int[] test= new int[10];
        //creation of array list
        ArrayList<Integer> arrayList = new ArrayList<>();
        //adding the elemnets to the arrayList
        //test[i]=10;
        //pointer=-1
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        //Type 1:
        //ArrayList 0,1
        for(int i=0;i<arrayList.size();i++){
            //test[i];
            System.out.println("Array valeus ::::"+arrayList.get(i));
        }

        //Type 2:
        //for(DataType <name>:Object)
        for(Integer sandeep:arrayList){
            //arrayList[o] = sandeep
            //arrayList[1] = sandeep
            System.out.println("Array valeus :::: "+sandeep);
        }

        //3rd type:
        //Iterator
        //hasNext() , next();
        Iterator<Integer> iterator=arrayList.iterator();
        //Inetrator having next element it will display
        while(iterator.hasNext()){
            System.out.printf("Print :::"+iterator.next());
        }




    }
}
