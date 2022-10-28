package loops;

public class BANK {
    public static void withdrawAmount(int amount) throws CustomExcpetion {
        if(amount==0){
            throw  new CustomExcpetion(amount);
        }else{
            System.out.printf("You can withdraw amount "+amount);
        }
    }


    public static void main(String[] args) throws CustomExcpetion {
        withdrawAmount(0);
    }
}
