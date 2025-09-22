package com.Abstract.Abstract7;
abstract class Product {
    String name;
    double price;
    Product(String name, double price) {
        this.name = name; this.price = price;
    }
    abstract void display();
}
