package Practice.Practice10;
public class Laptop {
    String brand;
    int ramSize;

    Laptop(String brand, int ramSize) {
        this.brand = brand;
        this.ramSize = ramSize;
    }

    void showDetails() {
        System.out.println("Brand: " + brand + ", RAM: " + ramSize + "GB");
    }
}
