package com.Pojo.Pojo6;

public class Test6 {
    public static void main(String[] args) {
        Flight f1 = new Flight("AI101", "Mumbai", "Delhi");
        Flight f2 = new Flight();
        f2.setFlightNo("BA202");
        f2.setSource("London");
        f2.setDestination("Paris");

        System.out.println(f1);
        System.out.println(f2);
    }
}
