package com.Pojo.Pojo7;

public class Test7 {
    public static void main(String[] args) {
        Hotel h1 = new Hotel("Taj", "Udaipur", 5);
        Hotel h2 = new Hotel();
        h2.setName("Marriott");
        h2.setLocation("Indore");
        h2.setRating(4);

        System.out.println(h1);
        System.out.println(h2);
    }
}
