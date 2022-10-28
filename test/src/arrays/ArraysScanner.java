package arrays;

import java.util.Scanner;

public class ArraysScanner {


    public static void checkArraysIsPostiveOrNegitive(int[] arrays){
        for(int i=0;i<=arrays.length-1;i++){
            if(arrays[i]>=0){
                System.out.println("Its is +ve number "+arrays[i]);
            }else{
                System.out.println("Its a -ve number "+arrays[i]);
            }
        }
    }

    public static void checkIfTheCharIsVowelOrNot(char[] chars){
        for(int i=0;i<chars.length;i++){
            if(chars[i]=='a' || chars[i]=='e' || chars[i]=='i' || chars[i]=='o' || chars[i]=='u'){
                System.out.println("The given char "+chars[i]+" is a vowel !");
            }else{
                System.out.println("The given char "+chars[i]+" is a not vowel !");
            }
        }
    }

    public static void main(String[] args) {
       /* int[] inputArray;
        int MAX;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the arrays");
        MAX=scanner.nextInt();
        inputArray=new int[MAX];

        int number;
        //Array created with the MAX value
        for(int i=0;i<=inputArray.length-1;i++){
            System.out.println("Enter the number");
            //13
            number=scanner.nextInt();
            //number=13
            inputArray[i]=number;
        }*/

        //We are having array of interegrs with both +ve and -ve number
        //checkArraysIsPostiveOrNegitive(inputArray);

        int MAX;
        char[] arrays;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the arrays");
        MAX=scanner.nextInt();
        arrays=new char[MAX];
        char c;
        for(int i=0;i<=arrays.length-1;i++){
            System.out.println("Enter the chracter");
            //13
            //hell0 // h
            c=scanner.next().charAt(0);
            //number=13
            arrays[i]=c;
        }

        checkIfTheCharIsVowelOrNot(arrays);


    }
}
