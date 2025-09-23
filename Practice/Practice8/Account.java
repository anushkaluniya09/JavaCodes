package Practice.Practice8;

public class Account {
    int accountNumber;
    double balance;

    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful");
    }

    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdraw successful");
    }

    void showBalance() {
        System.out.println("Balance: " + balance);
    }
}
