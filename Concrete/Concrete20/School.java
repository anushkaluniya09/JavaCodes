package com.Concrete.Concrete20;

class School {
    private String name;
    private String city;

    public School(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public void show() {
        System.out.println("School Name: " + name);
        System.out.println("City: " + city);
    }
}
