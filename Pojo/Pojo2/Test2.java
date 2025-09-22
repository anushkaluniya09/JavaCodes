package com.Pojo.Pojo2;

public class Test2 {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "John", 450);
        Book b2 = new Book();
        b2.setTitle("Python Guide");
        b2.setAuthor("Alice");
        b2.setPrice(300);

        System.out.println(b1);
        System.out.println(b2);
    }
}
