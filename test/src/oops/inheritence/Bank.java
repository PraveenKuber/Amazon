package oops.inheritence;

public class Bank {
    //Parent class
    //Min Bank% = 7% , SBI : 7.2% , Vijay Bank : 7.8% , HDFC : 14%
    int rateOfInterest = 7;
    public int getBasePrice(int loanAmount){
        int basePrice = loanAmount*rateOfInterest/100;
        return basePrice;
    }

    public int getLoanRepayDays(){
        int returnDays = 45;
        return returnDays;
    }

}
