package loops;

public class CustomExcpetion extends Exception{
    private int amount;
    public CustomExcpetion(int amount){
        System.out.printf("Bindu bank , Insufficient funds "+amount);
        this.amount=amount;
    }
}
