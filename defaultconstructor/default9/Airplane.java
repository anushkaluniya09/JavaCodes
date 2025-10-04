package defaultconstructor.default9;

public class Airplane {
    String flightNo;
    boolean flying;

    Airplane() {
        flightNo = "AI101";
        flying = false;
    }

    void info() {
        System.out.println("Flight: " + flightNo + ", Flying: " + flying);
    }
}
