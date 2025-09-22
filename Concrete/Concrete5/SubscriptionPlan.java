package com.Concrete.Concrete5;

class SubscriptionPlan {
    private String planName;
    private double monthlyCost;
    private int durationMonths;

    public SubscriptionPlan(String planName, double monthlyCost, int durationMonths) {
        this.planName = planName;
        this.monthlyCost = monthlyCost;
        this.durationMonths = durationMonths;
    }

    public void displayPlan() {
        System.out.println(planName + " plan costs $" + monthlyCost + "/month for " + durationMonths + " months");
    }
}
