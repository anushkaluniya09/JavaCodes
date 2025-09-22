package com.Abstract.Abstract4;

abstract class Animal {
    final void live() {
        breathe();
        eat();
        sound();
    }
    void breathe() { System.out.println("Breathing..."); }
    abstract void eat();
    abstract void sound();
}
