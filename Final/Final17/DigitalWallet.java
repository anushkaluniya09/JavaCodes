package com.Final.Final17;

final class DigitalWallet {
    private String walletId;
    private double balance;

    public DigitalWallet(String walletId, double balance) {
        this.walletId = walletId;
        this.balance = balance;
    }

    public void addMoney(double amount) {
        balance += amount;
        System.out.println(amount + " added. Current balance: $" + balance);
    }
}
