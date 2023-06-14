package org.amazon.workspace;

/*
*
*MaxProduct
* arr[] = {6, -3, -10, 0, 2}
Output:   180  // The subarray is {6, -3, -10}
*
* arr[] = {-1, -3, -10, 0, 60}
Output:   60  // The subarray is {60}
*
* arr[] = {-2, -40, 0, -2, -3}
Output:   80  // The subarray is {-2, -40}
* */

public class TestProgram1 {
    /*public static void MaxProduct(int[] arrays){
        int MAXProduct=0;
        int temp =0;
        int[] subArray=new int[arrays.length];
        for(int i=0;i< arrays.length;i++){
            for(int j=i;j<arrays.length;j++){
                System.out.println("i::::"+arrays[i]+":::: J:::"+arrays[j]);
                temp=temp+arrays[j]*arrays[j+1];
                System.out.println(" Temp:::: "+temp);
                if(temp>MAXProduct){
                    MAXProduct=temp;
                    System.out.println(" MaxProudct :::::::: "+MAXProduct);
                }
            }
        }*/

    public static void MaxProduct(int[] arrays){
        int MAXProduct=0;
        int temp =0;
        int counter=0;
        int[] subArray=new int[arrays.length];
        int MaxNumber=0;
        for(int i=0;i< arrays.length;i++){
              if((i+1)<arrays.length){
                  //System.out.println("I::"+arrays[i]+":::: J:::"+arrays[i+1]);
                  if(counter==0){
                      temp=arrays[i]*arrays[i+1];
                      MAXProduct=temp;
                      counter++;
                     // System.out.println("Temp:::::::"+temp);
                  }else {
                      temp=temp*arrays[i+1];
                      //System.out.println("Temp 2nd :::" + temp);
                      if (temp > MAXProduct) {
                          MAXProduct = temp;
                          //System.out.println("Max P:::" + MAXProduct);
                      }
                  }
                  //System.out.println("MaNumber ::::"+MaxNumber);
            }
            if(arrays[i]>MaxNumber){
                MaxNumber=arrays[i];
                if(MaxNumber>MAXProduct){
                    MAXProduct=MaxNumber;
                }
            }
        }
        //System.out.println("Max number ::::::"+MaxNumber);
        System.out.println("Max Product ::::::::"+MAXProduct);

    }

    public static void main(String[] args) {

        /*
*
*MaxProduct
* arr[] = {6, -3, -10, 0, 2}
Output:   180  // The subarray is {6, -3, -10}
*
* arr[] = {-1, -3, -10, 0, 60}
Output:   60  // The subarray is {60}
*
* arr[] = {-2, -40, 0, -2, -3}
Output:   80  // The subarray is {-2, -40}
* */


        int arrays[] = {6, -3, -10, 0, 2};
        int arrays2[] = {-1, -3, -10, 0, 60};
        int arrays3[]=  {-2, -40, 0, -2, -3};
        MaxProduct(arrays3);
    }
}
