package com.Abstract.Abstract23;

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void calculateInterest() {
        double interest = balance * 0.04;
        System.out.println("Interest: $" + interest);
    }
}
