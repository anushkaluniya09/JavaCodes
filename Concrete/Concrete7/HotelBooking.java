package com.Concrete.Concrete7;

class HotelBooking {
    private String bookingId;
    private String hotelName;
    private int nights;

    public HotelBooking(String bookingId, String hotelName, int nights) {
        this.bookingId = bookingId;
        this.hotelName = hotelName;
        this.nights = nights;
    }

    public void showBooking() {
        System.out.println("Booking #" + bookingId + " at " + hotelName + " for " + nights + " nights.");
    }
}
