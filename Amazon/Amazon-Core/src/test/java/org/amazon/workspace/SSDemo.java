package org.amazon.workspace;

public class SSDemo {

    public static void displayCombinations(int a,int b){
       /* for(int i=0;i<=a;i++){
            for(int j=0;j<=b;j++){
                System.out.println("I:::"+i+"::: J:::"+j);
            }
        }*/

        int max=a+b;
        char[] output;
        for(int i=0;i<max;i++){
            output = new char[max];
            for(int j=0;j<max;j++){
                if(i==j){
                    output[i]='a';
                }else{
                    output[j]='b';
                }
            }
            //System.out.printf("Output ::::");
            display(output);
        }

        //1,2 -> abb,bab,bba
        //4,1->aaaab,aabaa,abaaa,
    }

    public static void display(char[] array){
        for(Character c:array){
            System.out.printf(""+c);
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        System.out.println("Test");
        displayCombinations(4,1);
    }
}
