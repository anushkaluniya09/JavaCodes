package com.Abstract.Abstract22;

abstract class Meal {
    final void prepareMeal() {
        cook();
        eat();
        clean();
    }
    abstract void cook();
    void eat() {
        System.out.println("Eating meal...");
    }
    void clean() {
        System.out.println("Cleaning dishes...");
    }
}
