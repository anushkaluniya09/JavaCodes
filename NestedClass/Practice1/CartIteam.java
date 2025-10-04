package NestedClass.Practice1;
public class CartIteam {
    public static void main(String[] args) {
        Cart.Item item1 = new Cart.Item("Laptop", 2, 50000);
        Cart.Item item2 = new Cart.Item("Phone", 1, 30000);

        item1.display();
        item2.display();

        double total = item1.getTotal() + item2.getTotal();
        System.out.println("Total Price: " + total);
    }
}
