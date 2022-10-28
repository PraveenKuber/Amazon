package examples;
import java.util.Date;

public class Mobile {
    public String processor;
    public String camera;
    //public int ram
    public String version;
    public double screenSize;
    //public Double test;
    public String name;
    public Date mfgDat;
    public int id;

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getMfgDat() {
        return mfgDat;
    }

    public void setMfgDat(Date mfgDat) {
        this.mfgDat = mfgDat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        //mobile.id=12;
        mobile.setCamera("5 MP");
        mobile.setProcessor("1.3ghz");
        mobile.setName("vivo");
        mobile.setScreenSize(4.7);
        //mobile.setMfgDat(new Date());
        //mobile.setId(0001);
        System.out.println("Mobile daetails are ------>"+mobile.getCamera()+"::::"+mobile.getProcessor()
        +":::::"+mobile.getMfgDat());
        System.out.println("Mobile daetails are ------>"+mobile.getCamera()+"::::"+mobile.getProcessor()
                +":::::"+mobile.getMfgDat());

    }
}
