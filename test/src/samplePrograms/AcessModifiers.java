package samplePrograms;


import examples.MathOperation;

public class AcessModifiers extends MathOperation {

    final double PI=3.142;

    public final double getCirumferenceOfACircle(double radius){
        double result=0;
        if(radius>0){
            System.out.println("PI::::"+PI);
            result = 2*PI*radius;
        }
        else if(radius<0){
            System.out.printf("Its a negitive number");
        }
        else{
            System.out.printf("The radius should not be zero");
        }
        return result;
    }

    public void switchStatements(int number, int a,int b){
        System.out.printf("Number:::"+number);
        double result;
        switch (number){
            case 1:
                System.out.printf("Its a Sunday");
                result = a+b;
                break;
            case 2:
                System.out.printf("Its a Monday");
                break;
            case 3:
                System.out.printf("Its a tuesday");
                break;
            case 4:
                System.out.printf("Its a Wednesday");
                break;
            case 5:
                System.out.printf("Its a tuesday");
                break;
            case 6:
                System.out.printf("Its a Wednesday");
                break;
            default:
                System.out.printf("The given number not falls in any day!"+number);
        }
        String test = "test";

       /* switch (test){
            case "dell":
                System.out.printf("This is dell latp");
                break;
        }*/
    }


    public void checkTwoStringsAreEqualOrNot(String input1,String input2){
        if(input1.equals(input2)){
            System.out.printf("Equal");
        }else{
            System.out.printf("Not equal");
        }
    }



    public void test(){
        double test = PI*12;
    }






    public static void main(String[] args) {
        AcessModifiers acessModifiers = new AcessModifiers();
        acessModifiers.getCirumferenceOfACircle(10);
        //acessModifiers.switchStatements();
        String input1="test";
        String input2="test";
        acessModifiers.checkTwoStringsAreEqualOrNot(input1,input2);

        /*
        * PI=64bits=
        * result=64bits=, kill
        * */

        //acessModifiers.switchStatements(99);
    }
}
