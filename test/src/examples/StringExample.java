package examples;


import java.util.Scanner;

public class StringExample {

    public void demo(String input){
        System.out.printf("Input is:::"+input);
        String upperCase = input.toUpperCase();
        //input.
        System.out.printf("Upper case ::::"+upperCase);
    }

    public String getSubstring(String input,String subString){
        int indexOfSubstring = input.indexOf(subString);
        int endIndex = subString.length()+indexOfSubstring;
        String substring = input.substring(indexOfSubstring,endIndex);
        System.out.printf("result:::"+substring);
        return substring;
    }


    public static void main(String[] args) {
       StringExample stringExample = new StringExample();
       //Normal way to access method
        //stringExample.getSubstring("My laptop is leneovo","latop");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please entire ecomplete string");
        String input = scanner.nextLine();
        System.out.println("please enter the substring!");
        String substring = scanner.nextLine();
        stringExample.getSubstring(input,substring);
    }
}
