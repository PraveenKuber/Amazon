package examples;

public class MathOperation {

    /*
    * <access_specifier> <return_type> <method_name>(){
    *   <statements>
    *   return <variable_name_of_type>
    * }
    * */

    /*Addition of two numbers*/
    private void add(int a,int b){
        int c = a+b;
        System.out.printf("Sum is :::"+c);
    }

    private void displayMessage(){
        System.out.printf("Just display");
    }

    public int addition(int a,int b){
        int c=a+b;
        return c;
    }

     int division(int a){
        return 0;
    }

    protected void displayMessages(){
        System.out.printf("Display message");
    }

    public static void main(String[] args) {
        MathOperation mathOperation = new MathOperation();
        mathOperation.add(10,20);

        //Yes , I can access the private method since i created object in the same class
    }


}
