package oops.inheritence;

public class HDFC extends Bank {
    public int getSBILoanRepayDetails(){
        //Method
        //getLoanRepayDays , Its a method of super class/ parent class
        int numberOfDaysToRepay = getLoanRepayDays()+10;
        return numberOfDaysToRepay;
    }

    public int getInterestForTheLoanAmount(int loanAmount){
        //getBasePrice , Is is the method from the parent class
        int basePrice = getBasePrice(loanAmount);
        basePrice = basePrice*2/100;
        return basePrice;
    }

    public static void main(String[] args) {
        //1000000 bank
    }
}
