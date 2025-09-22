package com.Final.Final25;

final class DigitalLibraryCard {
    private String cardId;
    private int booksIssued;

    public DigitalLibraryCard(String cardId, int booksIssued) {
        this.cardId = cardId;
        this.booksIssued = booksIssued;
    }

    public void showCardInfo() {
        System.out.println("Card ID: " + cardId);
        System.out.println("Books Issued: " + booksIssued);
    }
}
