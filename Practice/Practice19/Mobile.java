package Practice.Practice19;
public class Mobile {
    String brand;
    double price;

    Mobile(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Price: " + price);
    }
}
