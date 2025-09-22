package com.Concrete.Concrete10;

class MovieTicket {
    private String movieName;
    private String seatNo;
    private double price;

    public MovieTicket(String movieName, String seatNo, double price) {
        this.movieName = movieName;
        this.seatNo = seatNo;
        this.price = price;
    }

    public void displayTicket() {
        System.out.println("Movie: " + movieName + ", Seat: " + seatNo + ", Price: $" + price);
    }
}
