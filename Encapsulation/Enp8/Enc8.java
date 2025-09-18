package Encapsulation.Enp8;
public class Enc8 {
    public static void main(String[] arge){
        AirConditioner ac=new AirConditioner();
        ac.setTemperature(25);
        System.out.print("AC Temperature: " + ac.getTemperature() + "°C");
        ac.setTemperature(25);

    }
}
