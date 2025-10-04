package defaultconstructor.default12;

public class Robot {
    String model;
    int battery;

    Robot() {
        model = "Robo-X";
        battery = 100;
    }

    void status() {
        System.out.println("Model: " + model + ", Battery: " + battery + "%");
    }
}
