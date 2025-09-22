package com.Static.Static13;

class Planet {
    static class Moon {
        String name;
        Moon(String name) { this.name = name; }
        void showMoon() { System.out.println("Moon: " + name); }
    }
}
