package NestedClass.Practice2;
public class ShowTransaction {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(0);
        BankAccount.Transaction txn = account.new Transaction();

        txn.deposit(5000);
        txn.withdraw(2000);

        account.showTransactions();
    }
}
