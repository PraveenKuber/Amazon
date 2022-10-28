package examples;

import samplePrograms.AcessModifiers;

import static examples.StudentStatic.performTesting;

public final class DemoMathOpeartion {

    public void test(){
        performTesting(10);
    }


    public static void main(String[] args) {

        /*Object of the MathOperation*/
        /*MathOperation mathOperation = new MathOperation();
        int c= mathOperation.addition(10,20);
        System.out.printf("C is:::"+c);
        c=mathOperation.addition(100,20);
        System.out.printf("c:::"+c);*/

        MathOperation mathOperation = new MathOperation();
        mathOperation.division(10);
        mathOperation.displayMessages();
        AcessModifiers acessModifiers = new AcessModifiers();


        //acessModifiers
        //acessModifiers.
        //acessModifiers.

    }
}
