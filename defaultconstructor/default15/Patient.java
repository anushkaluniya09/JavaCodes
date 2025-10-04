package defaultconstructor.default15;

public class Patient {
    private String patientId;
    private String name;

    public Patient() {
        this.patientId = "1009";
        this.name = "Mama ji";
    }
    public String getPatientId() {
        return patientId;
    }
    public String getName() {
        return name;
    }
}
