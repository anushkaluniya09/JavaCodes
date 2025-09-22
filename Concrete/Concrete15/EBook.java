package com.Concrete.Concrete15;

class EBook {
    private String title;
    private String author;
    private int pages;

    public EBook(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void readBook() {
        System.out.println("Reading " + title + " by " + author + " (" + pages + " pages)");
    }
}
