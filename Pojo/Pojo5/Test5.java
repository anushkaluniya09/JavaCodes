package com.Pojo.Pojo5;

public class Test5 {
    public static void main(String[] args) {
        User u1 = new User("anushka21", "anushka@gmail.com");
        User u2 = new User();
        u2.setUsername("nikita77");
        u2.setEmail("nikita@gmail.com");

        System.out.println(u1);
        System.out.println(u2);
    }
}
