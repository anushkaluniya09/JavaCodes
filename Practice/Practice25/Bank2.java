package Practice.Practice25;
public class Bank2 {
    double amount;

    Bank2(double amount) {
        this.amount = amount;
    }

    void withdraw(double withdrawalAmount) {
        String result = (withdrawalAmount <= amount) ? "Withdraw successful" : "Insufficient balance";
        if (withdrawalAmount <= amount) {
            amount -= withdrawalAmount;
        }
        System.out.println(result);
    }

    void deposit(double depositAmount) {
        amount += depositAmount;
        System.out.println("Deposit successful");
    }

    void showBalance() {
        System.out.println("Final Balance: " + amount);
    }
}
