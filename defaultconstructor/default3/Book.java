package defaultconstructor.default3;

public class Book {
    String title;
    String author;

    Book() {
        title = "Java Basics";
        author = "John Smith";
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author);
    }

}
