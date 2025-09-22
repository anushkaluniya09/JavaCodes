package com.Final.Final19;
final class TrainTicket {
    private String ticketNumber;
    private String passenger;
    private String trainName;

    public TrainTicket(String ticketNumber, String passenger, String trainName) {
        this.ticketNumber = ticketNumber;
        this.passenger = passenger;
        this.trainName = trainName;
    }

    public void displayTicket() {
        System.out.println("Ticket " + ticketNumber + ": " + passenger + " on " + trainName);
    }
}
