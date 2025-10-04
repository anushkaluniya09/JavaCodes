package NestedClass.Practice5;
public class ShowBill {
    public static void main(String[] args) {
        Bill.Item item1 = new Bill.Item("Pen", 10);
        Bill.Item item2 = new Bill.Item("Notebook", 50);

        System.out.println("Items:");
        item1.display();
        item2.display();

        double total = item1.price + item2.price;
        System.out.println("Total: " + total);
    }
}
