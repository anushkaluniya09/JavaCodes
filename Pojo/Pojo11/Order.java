package com.Pojo.Pojo11;

class Order {
    private int orderId;
    private String product;
    private double amount;

    public Order() {}

    public Order(int orderId, String product, double amount) {
        this.orderId = orderId;
        this.product = product;
        this.amount = amount;
    }

    public int getOrderId() { return orderId; }
    public void setOrderId(int orderId) { this.orderId = orderId; }

    public String getProduct() { return product; }
    public void setProduct(String product) { this.product = product; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", product=" + product + ", amount=" + amount + "]";
    }
}
