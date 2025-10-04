package NestedClass.Practice10;
public class Restaurant {
    class Category {
        String name;
        int items;

        Category(String name, int items) {
            this.name = name;
            this.items = items;
        }

        void display() {
            System.out.println("Category: " + name);
            System.out.println("Items: " + items);
        }
    }
}


