package com.Static.Static14;

class Airline {
    static class Flight {
        String flightNo;
        Flight(String flightNo) { this.flightNo = flightNo; }
        void showFlight() { System.out.println("Flight: " + flightNo); }
    }
}
