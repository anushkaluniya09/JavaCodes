package com.Concrete.Concrete3;

class Order {
    private int orderId;
    private String product;
    private int quantity;

    public Order(int orderId, String product, int quantity) {
        this.orderId = orderId;
        this.product = product;
        this.quantity = quantity;
    }

    public void displayOrder() {
        System.out.println("Order #" + orderId + ": " + quantity + " " + product + "(s)");
    }
}
