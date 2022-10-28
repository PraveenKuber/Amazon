package org.amazon;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertTrue;

public class NewTest {

        public static double getInterestForTheLoan(double p,double t,double r){
                double value=0;
                value = ( p * t * r )/100;
                System.out.println("Value is ::::"+value);
                return value;
        }


        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the value for a: ");
                double p = scanner.nextDouble();
                System.out.println("Enter the value for b: ");
                double t = scanner.nextDouble();
                System.out.println("Enter the value for C: ");
                double r = scanner.nextDouble();
                getInterestForTheLoan(p,t,r);

                //cheat code
                //psvm -> tab   public static void main(String[] args) {
                //sout -> tab   System.out.println("


        }
}
