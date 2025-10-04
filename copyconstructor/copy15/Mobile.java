package copyconstructor.copy15;

public class Mobile {
    String brand;
    double price;

    Mobile(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    Mobile(Mobile m) {
        this.brand = m.brand;
        this.price = m.price;
    }

    void show() {
        System.out.println("Brand: " + brand + ", Price: " + price);
    }
}
