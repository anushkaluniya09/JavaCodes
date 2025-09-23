package Practice.Practice6;

public class Circle {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    void area() {
        System.out.println("Area: " + (3.1416 * radius * radius));
    }
    void circumference() {
        System.out.println("Circumference: " + (2 * 3.1416 * radius));
    }
}
