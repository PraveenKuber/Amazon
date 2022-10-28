package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public int programId=10;
    public static int value=20;

    public static void printArray(int[] array,int iterationIndex){
        System.out.println("Array at the given iteration ---->"+iterationIndex);
        for(int i=0;i<=array.length-1;i++){
            System.out.println(array[i]);
        }
        System.out.println("****************************");
    }


    public static void sortArrayByOwnLogic(int[] array){
        //System.out.printf("Your program Id is :::"+value);
        System.out.println("Unsorted array is ");
        for(int i=0;i<=array.length-1;i++){
            System.out.println(array[i]);
        }
        /*Inbuilt function*/
        //Arrays.sort(array);

        /*
        Input : 43,11,56
        * step1: Start itrating the array in loop
        *
        *
        * */

        for(int i=0;i<array.length-1;i++){
            //43>11
            //43>56
            if(array[i]>array[i+1]){
                //True
                //temp=43
                int temp = array[i];
                //0 position=11
                array[i]=array[i+1];
                //1 position=43
                array[i+1]=temp;

                /*Reinitilise the array to the actual state*/
                i=-1;

            }

            //11,43,56
            printArray(array,i);
        }

        System.out.println("Sorted array is ");
        for(int i=0;i<=array.length-1;i++){
            System.out.println(array[i]);
        }

    }



    public static void main(String[] args) {
        /*Unsorted array creation*/
        int[] array;
        int MAX;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of the array");
        int number = scanner.nextInt();
        MAX=number;
        array=new int[MAX];
        //0,1,2,3//
        for(int i=0;i<=array.length-1;i++){
            System.out.println("Enter the number ");
            number= scanner.nextInt();
            array[i]=number;
        }

        /*
        * arrays[0]=1;
        * */

        sortArrayByOwnLogic(array);



    }
}
