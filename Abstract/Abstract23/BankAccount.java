package com.Abstract.Abstract23;

abstract class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract void calculateInterest();

    public void showBalance() {
        System.out.println("Account: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}
