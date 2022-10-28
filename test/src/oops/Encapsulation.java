package oops;

public class Encapsulation {
    private int enId;
    private String enName;
    private int enMemLocation;

    public int getEnId() {
        return enId;
    }

    public void setEnId(int enId) {
        this.enId = enId;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public int getEnMemLocation() {
        return enMemLocation;
    }

    public void setEnMemLocation(int enMemLocation) {
        this.enMemLocation = enMemLocation;
    }

    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.setEnId(101);
        encapsulation.setEnName("TestName");
        encapsulation.setEnMemLocation(200002);
        System.out.printf("Added:::: en");

        System.out.printf("Name is :::"+encapsulation.getEnName());




    }
}
