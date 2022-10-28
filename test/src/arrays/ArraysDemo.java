package arrays;

public class ArraysDemo {
    /*Declaration*/
    private int[] arrays;
    /*Declaration*/
    private final int MAXArray;

    public ArraysDemo(int arraySize){
        //size of the array
        MAXArray=arraySize;
        arrays= new int[MAXArray];
        System.out.println("Array size:::"+arrays.length);
    }


    public void insertValuesToArray(){
       /*Values adding*/
        for(int i=0;i<arrays.length-1;i++){
            //System.out.println("Added value "+(i*i)+" to the index::"+i);
            arrays[i]=i*i;
        }
    }

    public void fetchValuesFrom(){
        /*Values adding*/
        for(int i=0;i<arrays.length-1;i++){
            System.out.println("Value in the index::"+i+"  is "+arrays[i]);
        }
    }



    public static void demoInitialArray(int[] inputArray){
        /*Total size of the array*/
        int arrayLength = inputArray.length;
        System.out.println("Size of the array ----->"+arrayLength);
        System.out.println("3 rd index--->"+inputArray[2]+" ::::: last index :::::"+inputArray[arrayLength-1]);
    }





    public static void main(String[] args) {
       /* int[] input1= {10,20,30,40,50};
        int[] input2= new int[3];
        input2[0]=1;
        input2[1]=1;
        input2[2]=1222;
        System.out.printf("Added:::"+input2[2]);
        input2[2]=12;
        System.out.printf("Added:::"+input2[2]);
        demoInitialArray(input2);*/

        ArraysDemo arraysDemo = new ArraysDemo(10);
        arraysDemo.insertValuesToArray();
        arraysDemo.fetchValuesFrom();
    }
}
