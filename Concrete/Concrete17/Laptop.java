package com.Concrete.Concrete17;

class Laptop {
    private String brand;
    private int ram;

    public Laptop(String brand, int ram) {
        this.brand = brand;
        this.ram = ram;
    }

    public void showDetails() {
        System.out.println("Laptop Brand: " + brand);
        System.out.println("RAM: " + ram + "GB");
    }
}
