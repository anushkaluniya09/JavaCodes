package Practice.Practice2;

public class Empolyee {
    public int id;
    public String name;
    public int salary;

    public Empolyee(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void displayEmployeeDetails(){
        System.out.println("Employee Details");
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}
