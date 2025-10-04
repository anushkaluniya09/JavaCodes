package defaultconstructor.default18;

public class ParkingLot {
    int slots;
    String location;

    ParkingLot() {
        slots = 50;
        location = "Mall Basement";
    }

    void info() {
        System.out.println("Parking Location: " + location + ", Slots: " + slots);
    }

}
