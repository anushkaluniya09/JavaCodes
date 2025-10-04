package NestedClass.Practice6;
class Library {
    static class Book {
        String title, author;
        boolean available;

        Book(String title, String author, boolean available) {
            this.title = title;
            this.author = author;
            this.available = available;
        }

        void display() {
            System.out.println("Book: " + title + " - Author: " + author + " - Available: " + (available ? "Yes" : "No"));
        }
    }
}
