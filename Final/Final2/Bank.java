package com.Final.Final2;

final class Bank {
    private String name;
    private String branch;

    public Bank(String name, String branch) {
        this.name = name;
        this.branch = branch;
    }
    public void showDetails() {
        System.out.println("Bank: " + name + ", Branch: " + branch);
    }
}


