package org.amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MinMax {
    private List<Integer> globalList;

    MinMax(List<Integer> list){
        globalList=list;
        Collections.sort(list);
        int Min = list.get(0);
        int index = globalList.indexOf(Min);

        //for(int i=index;i<globalList.)

    }

   /* public int getMax(List<Integer> listData,int){

    }*/


    public static void main(String[] args) {
        //10,18,26,31,69,4,64
        //Max=69,MaxIndex=
        //4
        //
        //4-> Nth -> sublist
        //Max Sublist
        //
        //
        List<Integer> test = new ArrayList<>();
        test.add(10);
        test.add(18);
        test.add(26);
        test.add(4);
        test.add(69);
        test.add(31);
        test.add(64);

        List<Integer> data = test.stream().filter(i->i%2!=0).collect(Collectors.<Integer>toList());
        int odd = test.stream().filter(i->i%2!=0).mapToInt(a->a).sum()

                ;
        System.out.printf("Odd numbers :::"+odd);
        int count=0;
        for(Integer i:data){
            System.out.println("Data is :::"+i);
            count = count +i;
        }
        System.out.println("Odd count is ::"+count);

    }
}
