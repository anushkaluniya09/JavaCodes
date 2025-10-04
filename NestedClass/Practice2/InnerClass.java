package NestedClass.Practice2;

import java.util.ArrayList;
import java.util.List;

class BankAccount {
    double balance;
    List<String> transactions = new ArrayList<>();

    BankAccount(double balance) {
        this.balance = balance;
    }

    class Transaction {
        void deposit(double amount) {
            balance += amount;
            transactions.add("Deposit: " + amount);
        }

        void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                transactions.add("Withdraw: " + amount);
            } else {
                transactions.add("Failed Withdrawal: " + amount);
            }
        }
    }

    void showTransactions() {
        for (String t : transactions) {
            System.out.println(t);
        }
        System.out.println("Balance: " + balance);
    }
}
