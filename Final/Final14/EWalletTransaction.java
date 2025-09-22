package com.Final.Final14;

final class EWalletTransaction {
    private String transactionId;
    private double amount;

    public EWalletTransaction(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public void showTransaction() {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("Amount: $" + amount);
    }
}
