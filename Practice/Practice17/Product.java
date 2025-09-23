package Practice.Practice17;
public class Product {
    int productId;
    String productName;
    double price;

    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    void showDetails() {
        System.out.println("ProductId: " + productId + ", ProductName: " + productName + ", Price: " + price);
    }
}
