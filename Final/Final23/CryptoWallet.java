package com.Final.Final23;

final class CryptoWallet {
    private String walletAddress;
    private double balance;

    public CryptoWallet(String walletAddress, double balance) {
        this.walletAddress = walletAddress;
        this.balance = balance;
    }

    public void showBalance() {
        System.out.println("Wallet " + walletAddress + " has balance: " + balance + " BTC");
    }
}
