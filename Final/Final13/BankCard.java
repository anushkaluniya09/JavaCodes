package com.Final.Final13;

final class BankCard {
    private String cardNumber;
    private String cardHolder;

    public BankCard(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    public void showCardInfo() {
        System.out.println("Card Number: " + cardNumber + ", Holder: " + cardHolder);
    }
}
