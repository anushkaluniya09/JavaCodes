package com.Final.Final8;

final class Customer {
    private int id;
    private String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void showCustomer() {
        System.out.println("Customer ID: " + id + ", Name: " + name);
    }
}
