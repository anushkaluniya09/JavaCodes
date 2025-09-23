package Practice.Practice9;

public class Book {
    String title, author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}
