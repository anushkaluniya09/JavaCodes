package copyconstructor.copy7;

public class HospitalInfo {
    public static void main(String[] args) {
        Hospital h1 = new Hospital("AIIMS", 500);
        Hospital h2 = new Hospital(h1);
        h1.show();
        h2.show();
    }
}
