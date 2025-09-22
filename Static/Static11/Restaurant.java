package com.Static.Static11;

class Restaurant {
    static class Menu {
        String dish;
        Menu(String dish) { this.dish = dish; }
        void display() { System.out.println("Dish: " + dish); }
    }
}
