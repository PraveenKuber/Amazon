package org.example;

public class Address {
    public String streetName;
    public String area;
    public int pinCode;

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public void DisplayAll(){
        System.out.printf("Name::"+streetName+" Area "+area+" Pincode "+pinCode);
    }
}
