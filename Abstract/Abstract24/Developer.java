package com.Abstract.Abstract24;

class Developer extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Developer(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public void calculateSalary() {
        double salary = hourlyRate * hoursWorked;
        System.out.println("Salary: $" + salary);
    }
}
