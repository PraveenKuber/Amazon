package oops;

public abstract class House {
    abstract void getHousePrice();

    abstract void getHouseDesign();

    public void getHouseBasicDetails(){
        System.out.printf("The min requirment for house const is 30*40");
    }
}
