package Inheritance.InhHi7;
public class InHier7 {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        Refrigerator r = new Refrigerator();
        Microwave m = new Microwave();

        wm.powerOn();
        wm.washClothes();

        r.powerOn();
        r.keepCool();

        m.powerOn();
        m.heatFood();
    }
}
