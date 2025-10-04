package defaultconstructor.default7;

public class CryptoWallet {
    String owner;
    double balance;

    CryptoWallet() {
        owner = "Guest User";
        balance = 0.0;
    }

    void show() {
        System.out.println("Owner: " + owner + ", Balance: " + balance + " BTC");
    }
}
