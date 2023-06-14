package org.amazon.workspace;

import java.util.*;

/*
*X = 19
K = 4
O/P: {13, 17, 25, 27}
*
* */
public class DataTest {


  /*  private static void getPath(int[] arrays,int x,int k,int index){
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            //if((index+1)<=arrays.length){
            //    res[i]=arrays[index];
            //}
            if(index>1 && index <= arrays.length){

            }
        }
    }*/

    private static int getDiff(int x1,int x2){
        int diff;
        if(x1>x2){
            diff=x1-x2;
        }else{
            diff=x2-x1;
        }
        return diff;
    }

    private static void getPath(int[] arrays,int x,int k,int index){
        int[] diffArray=new int[arrays.length];
        int diff;
        int counter=0;
        for(int i=0;i<arrays.length;i++){
            if(i!=index){
                if((i+1)<arrays.length){
                    diff=getDiff(arrays[i],arrays[index]);
                    diffArray[counter]=diff;
                    counter++;
                }
            }else{
                diffArray[counter]=0;
                counter++;
            }
        }

        Map<Integer,List<Integer>> map =new TreeMap<>();
        List<Integer> temp;
        for(int i=0;i<diffArray.length;i++){
            System.out.println("diff is :::::::"+diffArray[i]);
            if(!map.containsKey(diffArray[i])){
                temp=new ArrayList<>();
                temp.add(i);
                map.put(diffArray[i],temp);
            }else{
                temp=map.get(diffArray[i]);
                System.out.println("Temp is ::::"+temp);
                temp.add(i);
                map.put(diffArray[i],temp);
            }
        }
        System.out.println("Map is ::::::::"+map.toString());
        //get index







        //System.out.println("Arrays is :::::::"+diffArray.toString());
    }

    public static void displayShortestElements(int[] arrays,int x,int k){
        int index=0;
        for(int i=0;i<arrays.length;i++){
            if(arrays[i]==x){
                System.out.println("Element found!"+x);
                index=i;
                getPath(arrays,x,k,index);
                break;
            }
        }
    }

    public static void main(String[] args) {
        //5,4,7,8
        //
        int[] arrays = {2, 5, 8, 10, 13, 17, 19, 25, 27, 32};
        int x=19;
        int k=4;
        displayShortestElements(arrays,x,k);

    }
}
