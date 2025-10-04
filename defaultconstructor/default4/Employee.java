package defaultconstructor.default4;

public class Employee extends Company {
    private String name;

    public Employee() {
        super();
        name = "Anushka";
    }

    public void details() {
        System.out.println("Company: " + company + ", Employee: " + name);
    }
}
