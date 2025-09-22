package com.Static.Static4;

class Car {
    static class Engine {
        int horsepower;
        Engine(int hp) { this.horsepower = hp; }
        void start() { System.out.println("Engine with " + horsepower + " HP started."); }
    }
}
