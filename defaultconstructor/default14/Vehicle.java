package defaultconstructor.default14;

public class Vehicle {
    private String name;
    private String type;

    public Vehicle() {
        this.name = "Ratlam";
        this.type = "Off-Roading";
    }

    public String getVin() {
        return name;
    }

    public String getType() {
        return type;

    }
}