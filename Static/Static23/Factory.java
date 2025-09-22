package com.Static.Static23;

class Factory {
    static class Machine {
        String type;
        Machine(String type) { this.type = type; }
        void showMachine() { System.out.println("Machine: " + type); }
    }
}
