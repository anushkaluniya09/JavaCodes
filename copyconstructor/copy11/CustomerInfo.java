package copyconstructor.copy11;

public class CustomerInfo {
    public static void main(String[] args) {
        Customer cust1 = new Customer(101, "Anushka", "Indore");
        Customer cust2 = new Customer(103,"Nikita","Indore");
        cust1.display();
        cust2.display();
    }
}
