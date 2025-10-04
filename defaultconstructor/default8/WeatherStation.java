package defaultconstructor.default8;

public class WeatherStation {
    String city;
    double temperature;

    WeatherStation() {
        city = "Unknown City";
        temperature = 25.0;
    }

    void report() {
        System.out.println("City: " + city + ", Temperature: " + temperature + "°C");
    }
}
