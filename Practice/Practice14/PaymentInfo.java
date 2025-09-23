package Practice.Practice14;
public class PaymentInfo {
    public static void main(String[] args) {
        Payment p1 = new CreditCardPayment();
        p1.pay();

        Payment p2 = new UPIPayment();
        p2.pay();
    }
}
