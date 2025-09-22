package com.Final.Final18;

final class InsurancePolicy {
    private String policyNumber;
    private String holderName;
    private double coverageAmount;

    public InsurancePolicy(String policyNumber, String holderName, double coverageAmount) {
        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.coverageAmount = coverageAmount;
    }

    public void showPolicy() {
        System.out.println("Policy " + policyNumber + " for " + holderName + " covers $" + coverageAmount);
    }
}
