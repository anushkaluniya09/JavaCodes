package Practice.Practice24;
public class Order {
    int id;
    double amount;
    String status;

    Order(int id, double amount, String status) {
        this.id = id;
        this.amount = amount;
        this.status = status;
    }

    void displayOrder() {
        System.out.println("OrderId: " + id + ", Amount: " + amount + ", Status: " + status);
    }
}
