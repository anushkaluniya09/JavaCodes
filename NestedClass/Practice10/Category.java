package NestedClass.Practice10;
public class Category {
    public static void main(String[] args) {
        Restaurant r = new Restaurant();
        Restaurant.Category c1 = r.new Category("Appetizers", 5);
        Restaurant.Category c2 = r.new Category("Main Course", 10);

        c1.display();
        c2.display();
    }
}
