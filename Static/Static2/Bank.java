package com.Static.Static2;

class Bank {
    static class Account {
        int balance;
        Account(int balance) { this.balance = balance; }
        void showBalance() { System.out.println("Balance: " + balance); }
    }
}
