package arrays;

import java.util.Scanner;

public class FindDuplicateString {
    static String[] results=new String[100];
    static int GC=0;

    public static void findStringDuplicate(String[] names){
        System.out.println("The array names are");
        for(int i=0;i<=names.length-1;i++){
            System.out.println(names[i]);
        }

        //java,java,cpp,c,java,java,java,cpp,gg,
        //i=c
        //j=c
        //Intermediate array
        int counter=0;
        for(int i=0;i<=names.length-1;i++){
            //2//java
           for(int j=0;j<= names.length-1;j++){
             //4//c
               //java==c
               if(names[i].equals(names[j])){
                   counter++;
                   if(counter>=2){
                       //System.out.println("The given string is duplicate ::::"+names[i]);
                       checkAndAdd(names[i]);
                       break;
                   }
               }
           }
           counter=0;
        }


        /*for(int i=0;i<=names.length-1;i++){
            //System.out.println(" check "+(i+1));
          for(int j=i+1;j<=names.length-1;j++){
              //System.out.println(" check 1"+(i+1));
              //System.out.println(names[i]+" ::::: "+names[j]);
              if(names[i].equals(names[j])){
                  System.out.println("The given string is duplicate ::::"+names[i]);
              }
          }
        }*/

        for(int i=0;i<GC;i++){
            System.out.println("The Duplicate string is ::::"+results[i]);
        }


    }

    public static void checkAndAdd(String name){
        boolean status=false;
        //System.out.printf("Name:::"+name);
        for(int i=0;i<results.length-1;i++){
            String value = results[i];
            if(value!=null){
                if(results[i].equals(name)){
                    status=true;
                    break;
                }
            }
        }

        if(status==false){
            results[GC]=name;
            System.out.println("results :::"+results[GC]+":::: GC:::"+GC);
            GC++;
            //System.out.printf("results :::"+results[GC]);
           // System.out.printf("Results :::::"+results);
        }
    }



    public static void main(String[] args) {
        String[] array;
        int MAX;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of the array");
        int number = scanner.nextInt();
        MAX=number;
        array=new String[MAX];
        String name;
        for(int i=0;i<=array.length-1;i++){
            System.out.println("Enter the number ");
            name= scanner.next();
            array[i]=name;
        }

        findStringDuplicate(array);


    }
}
