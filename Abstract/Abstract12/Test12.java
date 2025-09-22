package com.Abstract.Abstract12;

public class Test12 {
    public static void main(String[] args) {
        Ticket t1 = new MovieTicket();
        Ticket t2 = new TrainTicket();
        t1.book("Anushka");
        t2.book("Rahul");
    }
}
