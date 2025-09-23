package Practice.Practice25;
public class Bank2Details {
    public static void main(String[] args) {
        // Initialize account with 10000
        Bank2 account = new Bank2(10000);
        account.withdraw(5000);
        account.deposit(5000);
        account.showBalance();
    }
}
