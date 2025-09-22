package com.Pojo.Pojo3;

public class Test3 {
    public static void main(String[] args) {
        Movie m1 = new Movie("Avengers", "Action", 8.5);
        Movie m2 = new Movie();
        m2.setTitle("Titanic");
        m2.setGenre("Romance");
        m2.setRating(9.0);

        System.out.println(m1);
        System.out.println(m2);
    }
}
