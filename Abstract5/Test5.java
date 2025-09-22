package com.Abstract.Abstract5;

public class Test5 {
    public static void main(String[] args) {
        Transport t1 = new Car();
        Transport t2 = new Airplane();
        t1.move();
        t2.move();
    }
}
