package com.Final.Final5;

final class Invoice {
    private int invoiceNo;
    private double amount;

    public Invoice(int invoiceNo, double amount) {
        this.invoiceNo = invoiceNo;
        this.amount = amount;
    }

    public void printInvoice() {
        System.out.println("Invoice #" + invoiceNo + " | Amount: " + amount);
    }
}
