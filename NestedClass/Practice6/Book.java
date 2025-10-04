package NestedClass.Practice6;
public class Book {
    public static void main(String[] args) {
        Library.Book b1 = new Library.Book("Java Programming", "James Gosling", true);
        Library.Book b2 = new Library.Book("Clean Code", "Robert Martin", false);

        b1.display();
        b2.display();

        System.out.println("Total Books: 2");
    }
}
