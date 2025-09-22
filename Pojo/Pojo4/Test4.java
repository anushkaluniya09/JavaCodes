package com.Pojo.Pojo4;

public class Test4 {
    public static void main(String[] args) {
        Address a1 = new Address("Mumbai", "Maharashtra", "India");
        Address a2 = new Address();
        a2.setCity("Delhi");
        a2.setState("Delhi");
        a2.setCountry("India");

        System.out.println(a1);
        System.out.println(a2);
    }
}
