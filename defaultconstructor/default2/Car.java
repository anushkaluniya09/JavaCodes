package defaultconstructor.default2;

public class Car {
    String model;
    double price;

    Car() {
        model = "Grandi10";
        price = 800000;
    }

    void display() {
        System.out.println("Model: " + model + ", Price: " + price);
    }

}
