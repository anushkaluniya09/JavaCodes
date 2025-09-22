package com.Static.Static25;

class Student {
    String name;

    Student(String name) { this.name = name; }

    static class Address {
        String city;
        Address(String city) { this.city = city; }
        void show() { System.out.println("City: " + city); }
    }
}
