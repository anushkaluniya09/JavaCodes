package com.Abstract.Abstract7;
class Electronics extends Product {
    Electronics(String name, double price) { super(name, price); }
    void display() {
        System.out.println("Electronics: " + name + " - $" + price);
    }
}
