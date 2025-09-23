package Practice.Practice20;
public class Pen {
    String color;
    double price;

    Pen(String color, double price) {
        this.color = color;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Color: " + color + ", Price: " + price);
    }
}
