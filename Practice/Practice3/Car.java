package Practice.Practice3;

public class Car {
    String model;
    double price;

    Car(String model, double price) {
        this.model = model;
        this.price = price;
    }
    void displayCarInfo() {
        System.out.println("Model: " + model + ", Price: " + price);
    }
}
