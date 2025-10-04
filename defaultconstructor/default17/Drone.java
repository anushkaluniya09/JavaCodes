package defaultconstructor.default17;

public class Drone {
    String id;
    boolean inAir;

    Drone() {
        id = "DRN-001";
        inAir = false;
    }

    void status() {
        System.out.println("Drone ID: " + id + ", In Air: " + inAir);
    }
}
