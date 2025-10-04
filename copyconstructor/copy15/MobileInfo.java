package copyconstructor.copy15;

public class MobileInfo {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Samsung", 25000);
        Mobile m2 = new Mobile("Realme",30000);
        m1.show();
        m2.show();
    }
}
