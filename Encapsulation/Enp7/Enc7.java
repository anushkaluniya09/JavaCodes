package Encapsulation.Enp7;
public class Enc7 {
    public static void main(String[] args){
        Car c=new Car();
        c.setModel1("Honda");
        c.setSpeed(200);
        c.setColor("Black");

        System.out.println(c.getModel1());
        System.out.println(c.getSpeed());
        System.out.println(c.getColor());
    }
}
