package examples;

public class ConstructorDemo {
    /*Global variable*/
    private final double Training_PI;

    /*Constructor is method , it will invoke/call whenever the obj is created
    * Constructor name should be same as class name
    * Constructor doesnot have any return type.
    * It is used to assign the values , when the object is created
    * By default , the constructor should call without any parameters
    * 2 types of constructor
    * 1.Default c
    * 2.Parameterised cons
    * */

    /*Default constructor*/
    public ConstructorDemo(){
        Training_PI= 3.124;
    }

    /*Parameterised cons*/
    public ConstructorDemo(double customPI){
        Training_PI=customPI;
    }

    public void displayCircleOp(int radius){
        System.out.println("PI value is :::::"+Training_PI);
        double results = 2*Training_PI*radius;
        System.out.println("Cir of the circle is "+results);
    }

    public static void main(String[] args) {

        ConstructorDemo constructorDemo = new ConstructorDemo();
        constructorDemo.displayCircleOp(10);
        ConstructorDemo testParm = new ConstructorDemo(4.142);
        testParm.displayCircleOp(10);

    }



}
