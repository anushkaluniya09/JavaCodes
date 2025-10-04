package defaultconstructor.default20;

public class CinemaSeat {
    int seatNo;
    boolean booked;

    CinemaSeat() {
        seatNo = 1;
        booked = false;
    }

    void details() {
        System.out.println("Seat No: " + seatNo + ", Booked: " + booked);
    }
}
