package com.Final.Final6;

final class Library {
    private String name;
    private int totalBooks;

    public Library(String name, int totalBooks) {
        this.name = name;
        this.totalBooks = totalBooks;
    }

    public void showLibrary() {
        System.out.println("Library: " + name + ", Total Books: " + totalBooks);
    }
}
