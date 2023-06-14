package org.amazon.workspace;

import java.util.ArrayList;
import java.util.List;

/*
* Input: 5
* output:
*
*  	    1
      1   1
     1  2  1
   1  3  3  1
  1   4  6  4  1
*
*
*
* */
public class Demo1 {


    public static List<Integer> generateSequence(List<Integer> list){
        List<Integer> interm = new ArrayList<>();
        int sum =0;
        interm.add(1);
        for(int i=0;i<list.size();i++){
            if((i+1)< list.size()){
                sum=list.get(i)+list.get(i+1);
                //System.out.println("Sum :::::::::"+sum);
                interm.add(sum);
            }
        }
        interm.add(1);
        System.out.println("Arrays list"+interm.toString());
        return interm;
    }



    public static void displayPattern(int level){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        int count = 1;
       // List<Integer> temp = new ArrayList<>();
        System.out.println("Arrays list"+list.toString());
        while(count<=level){
            //System.out.println("Level is "+count);
            if(count>2){
                list =  generateSequence(list);
            }
            count++;
        }
    }

    public static void main(String[] args) {
        displayPattern(6);
        /*List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(3);
        list.add(1);
        generateSequence(list);*/
    }

}
