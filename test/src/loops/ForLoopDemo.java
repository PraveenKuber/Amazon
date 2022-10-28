package loops;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ForLoopDemo {

    public static void displayTable(int number){
       // for (){
            for(int i=1;i<=10;i++){
                System.out.println(number+" * "+i+" = "+ number*i);
            }
       // }
    }

    public static void displayWhileTable(int number){
       int i=10;
       //1
        //1<=10
       while (i<=5){
           //1
           System.out.println(number+" * "+i+" = "+ number*i);
           //11
           i++;
           //
       }
    }

    public static void displayDOWhileTable(int number){
        int i=10;
        do{
            System.out.println(number+" * "+i+" = "+ number*i);
            i++;
        }while(i<=5);
    }

    public static void displayDOWhileTables(int a){
        //1000 lines , Almost process
        int i=10;
        System.out.println("I is :::"+i);
        double c=0;
        try {
             c = 10/a;
        }/*catch (Exception e){
            System.out.println(e.getMessage());
        }*/
        finally {
            File file = new File("/home/praveen/Documents/Java1/oops.txt");
            boolean test = file.exists();
            System.out.printf("Came to finally block");
        }
        File file = new File("/home/praveen/Documents/Java1/oops.txt");
        boolean test = file.exists();
        System.out.println("Test:::"+test);
        c=c*100;
        System.out.println("C::::"+c);
    }

    public static void fileCheck() throws Exception{
        FileReader fileReader;
        File file = new File("/home/praveen/Documents/Java/java111.txt");
        if(!file.exists()){
            fileReader = new FileReader(file);
            System.out.println("File exists!");
            //throw new IOException();
        }else{
            System.out.println("File exists!");

        }
    }

    public static void main(String[] args) throws Exception {
        //displayTable(4);
        //displayWhileTable(10);
        //displayDOWhileTable(10);
        //displayDOWhileTables(0);
        fileCheck();
    }
}
