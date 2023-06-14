package org.amazon.workspace;

public class Prime {

    public static void printPrimeNumbers(int range) {
        if (range == 1) {
            System.out.println("Its a prime number :::"+range);
        } else if (range > 1) {
        for (int i = 2; i <= range; i++) {
            for (int j = 2; j <= i; j++) {
                //System.out.println("i :::"+i+" j:::"+j);
                //2%4
                if (i % j == 0) {
                    //System.out.println("Came here :::"+i+"::::"+j);
                    if(i==j){
                        System.out.println("Its a Prime number " + i);
                    }else{
                        break;
                    }
                }
            }
        }
    }
    }

    public static void main(String[] args) {
        //1,3,5,7,9
        printPrimeNumbers(100);
    }
}
