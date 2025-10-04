package copyconstructor.copy7;

public class Hospital {
    String hospitalName;
    int beds;

    Hospital(String n, int b) {
        hospitalName = n;
        beds = b;
    }

    Hospital(Hospital h) {
        hospitalName = h.hospitalName;
        beds = h.beds;
    }

    void show() {
        System.out.println("Hospital: " + hospitalName + ", Beds: " + beds);
    }
}
