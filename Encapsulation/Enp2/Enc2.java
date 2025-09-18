package Encapsulation.Enp2;
public class Enc2 {
    public static void main(String[] args) {
        BankAccount acc = getBankAccount();

        System.out.println("Account Holder: " + acc.getAccountHolder());
        System.out.println("Balance: " + acc.getBalance());

        acc.deposit(2000);
        acc.withdraw(1500);

        System.out.println("Updated Balance: " + acc.getBalance());
 }

    private static BankAccount getBankAccount() {
        BankAccount acc = new BankAccount("Anushka",5000);
        return acc;
    }
}


