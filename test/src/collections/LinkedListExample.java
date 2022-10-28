package collections;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<Integer> test = new LinkedList<>();
        for(int i=0;i<100;i++){
            test.add(i);
        }
       /* test.add(10);
        test.add(20);
        test.add(30);
        test.add(40);
        test.add(10);
        test.add(20);
        test.add(30);
        test.add(40);*/
        //Scanner
        //Enter the number you want to search
        //int searchElement;
        for(Integer value:test){

            System.out.println(" Data is :::"+value);
            //if(value==searchElement)
            //The elemet is there
        }

    }
}
