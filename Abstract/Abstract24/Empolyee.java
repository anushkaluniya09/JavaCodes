package com.Abstract.Abstract24;

abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public abstract void calculateSalary();

    public void showName() {
        System.out.println("Employee: " + name);
    }
}
