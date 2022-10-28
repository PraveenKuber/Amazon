package arrays;

public class CopyArray {

    public static void copyarray(int[] array1, int[] array2) {
        int[] array3=new int[array1.length+array2.length];

        for (int i = 0; i <= array2.length - 1; i++) {
            array3[i] = array2[i];
        }

        int initial= array2.length;
        System.out.println("Array length ::::"+array3.length);
        for(int i=0;i<=array1.length-1;i++){
            array3[initial]=array1[i];
            System.out.println("Array::::"+array3[initial]);
            initial++;
        }

        System.out.println("copied array elements are ");

        for (int i = 0; i <=array3.length-1; i++) {
            System.out.println(array3[i]);
        }

    }

    public static void main(String[] args) {
        //int a[]= {1,2};
        //int b[]={3,4};
        //copyarray(a,b);

        int test = 5/2;
        System.out.printf("test:::"+test);
    }

}

