package copyconstructor.copy11;

public class Customer {
    int id;
    String name;
    String city;

    Customer(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    Customer(Customer c) {
        this.id = c.id;
        this.name = c.name;
        this.city = c.city;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", City: " + city);
    }
}
