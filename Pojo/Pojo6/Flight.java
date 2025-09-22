package com.Pojo.Pojo6;

class Flight {
    private String flightNo;
    private String source;
    private String destination;

    public Flight() {}
    public Flight(String flightNo, String source, String destination) {
        this.flightNo = flightNo;
        this.source = source;
        this.destination = destination;
    }

    public String getFlightNo() { return flightNo; }
    public void setFlightNo(String flightNo) { this.flightNo = flightNo; }

    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }

    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }

    @Override
    public String toString() {
        return "Flight [flightNo=" + flightNo + ", source=" + source + ", destination=" + destination + "]";
    }
}
