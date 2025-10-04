package NestedClass.Practice5;
class Bill {
    static class Item {
        String name;
        double price;

        Item(String name, double price) {
            this.name = name;
            this.price = price;
        }

        void display() {
            System.out.println(name + " - " + price);
        }
    }
}

