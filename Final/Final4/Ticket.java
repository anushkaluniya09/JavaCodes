package com.Final.Final4;

final class Ticket {
    private int ticketNo;
    private String eventName;

    public Ticket(int ticketNo, String eventName) {
        this.ticketNo = ticketNo;
        this.eventName = eventName;
    }

    public void showTicket() {
        System.out.println("Ticket No: " + ticketNo + ", Event: " + eventName);
    }
}
