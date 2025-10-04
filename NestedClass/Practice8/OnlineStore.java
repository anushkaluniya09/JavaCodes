package NestedClass.Practice8;
public class OnlineStore {
    void applyDiscount(double price, double discount) {
        class Discount {
            double calculate() {
                return price - (price * discount / 100);
            }
        }

        System.out.println("Original Price: " + price);
        System.out.println("Discount: " + discount + "%");
        Discount d = new Discount();
        System.out.println("Final Price: " + d.calculate());
    }
}
