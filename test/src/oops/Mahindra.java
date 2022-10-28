package oops;

public class Mahindra implements iCar{
    private int length=12;
    private int width=15;

    //for ex: what if , for each car class 100 methods

    @Override
    public int calculateSpeed() {
        int speed=160;
        return speed;
    }

    @Override
    public int calculateOverAllSize() {
        int overAllSize = length*width;
        return overAllSize;
    }

    @Override
    public int showExShowRoomPrice() {
        //
        int price=1000000;
        return price;
    }

    @Override
    public int getMailege() {
        //
        int mailege = 17;
        return mailege;
    }

    public void MahindraEditionFeatures(){
        System.out.printf("This is sepcific to Mahindra");
    }
}
