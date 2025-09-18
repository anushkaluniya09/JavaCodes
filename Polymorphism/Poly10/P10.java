package Polymorphism.Poly10;
public class P10 {
    public static void main(String[] args) {
        Payment p1 = new CreditCard();
        Payment p2 = new UPI();
        p1.pay();
        p2.pay();
}
}