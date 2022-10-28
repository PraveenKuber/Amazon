package examples;


import samplePrograms.AcessModifiers;

import java.util.Scanner;

public class ScannersExample {
    public static void main(String[] args) {
        AcessModifiers acessModifiers = new AcessModifiers();
        //AcessModifiers
        //acessModifiers.getCirumferenceOfACircle(10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value for number , which falls between Sun - Sat ----->");
        int number = scanner.nextInt();
        System.out.println("Please enter the value for a----->");
        int a = scanner.nextInt();
        System.out.println("Please enter the value for b----->");
        int b = scanner.nextInt();
        acessModifiers.switchStatements(number,a,b);
    }
}
