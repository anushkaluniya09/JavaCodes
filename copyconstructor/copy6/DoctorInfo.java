package copyconstructor.copy6;

public class DoctorInfo {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("Dr. Mehta", "Cardiology");
        Doctor d2 = new Doctor(d1);
        d1.display();
        d2.display();
    }
}
