package com.Final.Final16;

final class Passport {
    private String passportNumber;
    private String holderName;

    public Passport(String passportNumber, String holderName) {
        this.passportNumber = passportNumber;
        this.holderName = holderName;
    }

    public void showDetails() {
        System.out.println("Passport No: " + passportNumber + ", Holder: " + holderName);
    }
}
