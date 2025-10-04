package copyconstructor.copy6;

public class Doctor {
    String name;
    String specialization;

    Doctor(String n, String s) {
        name = n;
        specialization = s;
    }

    Doctor(Doctor d) {
        name = d.name;
        specialization = d.specialization;
    }

    void display() {
        System.out.println("Doctor: " + name + ", Specialization: " + specialization);
    }
}
