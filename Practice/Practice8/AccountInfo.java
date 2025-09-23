package Practice.Practice8;
public class AccountInfo {
    public static void main(String[] args) {
        Account acc = new Account(101, 5000);
        acc.deposit(3000);
        acc.withdraw(1000);
        acc.showBalance();
    }
}
