package com.Abstract.Abstract23;

public class Test23 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA101", 1000);
        sa.showBalance();
        sa.calculateInterest();
    }
}
