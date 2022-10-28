package loops;

public class PrimeDemo {

    //method area/ class area
    public static void printPrimeNumbers(int max){
        ForLoopDemo l = new ForLoopDemo();
        for(int i=1;i<=max;i++){
            System.out.printf("");
            for(int j=2;j<=i;j++){
                System.out.printf("");
                if(i==j){
                    System.out.println("It is a prime number --> "+i);
                }else{
                    if(i%j==0){
                        //System.out.println(i+"Not a prime number ");
                        break;
                    }
                }
            }
        }
    }

    //class area/method area
    public static void checkNumberIsPrimeOrNot(int num){
        for(int j=2;j<=num;j++){
            if(j==num){
                System.out.println("It is a prime number --> "+num);
            }else{
                if(num%j==0){
                    System.out.println(num+"Not a prime number ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        //heap
        printPrimeNumbers(100);
        //heap , scp
        String test = "Test";
        //checkNumberIsPrimeOrNot(7);
    }
}
