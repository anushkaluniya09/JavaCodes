package com.Static.Static22;

class Airport {
    static class Gate {
        int gateNo;
        Gate(int gateNo) { this.gateNo = gateNo; }
        void showGate() { System.out.println("Gate: " + gateNo); }
    }
}
