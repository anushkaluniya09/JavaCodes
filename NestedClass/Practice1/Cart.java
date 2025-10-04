package NestedClass.Practice1;
public class Cart {
    static class Item {
        String name;
        int quantity;
        double price;

        Item(String name, int quantity, double price) {
            this.name = name;
            this.quantity = quantity;
            this.price = price;
        }

        void display() {
            System.out.println("Item: " + name + " - " + quantity + " x " + price);
        }

        double getTotal() {
            return quantity * price;
        }
    }
}
