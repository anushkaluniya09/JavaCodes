package Practice.Practice21;
public class Customer {
    int id;
    String name;
    String city;

    Customer(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    void displayCustomer() {
        System.out.println("ID: " + id + ", Name: " + name + ", City: " + city);
    }
}
