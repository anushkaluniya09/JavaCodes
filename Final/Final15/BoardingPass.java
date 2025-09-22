package com.Final.Final15;

final class BoardingPass {
    private String flightNo;
    private String passengerName;

    public BoardingPass(String flightNo, String passengerName) {
        this.flightNo = flightNo;
        this.passengerName = passengerName;
    }

    public void showPass() {
        System.out.println("Flight: " + flightNo + ", Passenger: " + passengerName);
    }
}
