package org.amazon.workspace;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HMDemo {

    /*
    * List<Int>
    * */

    public static void printFibonnaciSeries(int max){
        int res=0;
       for(int i=0;i<max;i++){
           //if((i+1)<=max)
           System.out.println(""+i+"  :::"+(i+1));
               res= res + (i+1);
               System.out.println("res:::"+res);
           //}
       }
    }
    public static void main(String[] args) {
        System.out.println("HM Demo");
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(9);
        list.add(7);
        list.add(15);

        //List<Integer> sort = list.stream().sorted().collect(Collectors.toList());
       //ystem.out.println("Sort::::"+sort.toString());
        //0,1,1,2,3,5,8,13,21
        printFibonnaciSeries(10);
    }
}
