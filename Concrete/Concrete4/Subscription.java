package com.Concrete.Concrete4;

class Subscription {
    private String subscriberName;
    private String plan;
    private double price;

    public Subscription(String subscriberName, String plan, double price) {
        this.subscriberName = subscriberName;
        this.plan = plan;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println(subscriberName + " has subscribed to " + plan + " plan for $" + price);
    }
}
