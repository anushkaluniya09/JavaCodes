package com.Final.Final3;

final class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }
}
