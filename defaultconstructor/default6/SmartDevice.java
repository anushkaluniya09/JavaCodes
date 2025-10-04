package defaultconstructor.default6;

public class SmartDevice {
    String name;
    boolean powerOn;

    SmartDevice() {
        name = "Smart Bulb";
        powerOn = false;
    }

    void info() {
        System.out.println("Device: " + name + ", Power On: " + powerOn);
    }
}
