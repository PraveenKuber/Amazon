package loops;

public class Customizedexception extends Exception{
    private double temperature;
    public Customizedexception(double temperature) {
        System.out.println("the is temperature is high turn off the device "+temperature);
        this.temperature=temperature; }
}
