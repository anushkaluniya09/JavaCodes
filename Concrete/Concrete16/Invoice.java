package com.Concrete.Concrete16;

class Invoice {
    private int invoiceNo;
    private double amount;

    public Invoice(int invoiceNo, double amount) {
        this.invoiceNo = invoiceNo;
        this.amount = amount;
    }

    public void printInvoice() {
        System.out.println("Invoice No: " + invoiceNo);
        System.out.println("Amount: $" + amount);
    }
}
