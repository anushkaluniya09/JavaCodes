package com.Static.Static17;

class Park {
    static class Ride {
        String rideName;
        Ride(String rideName) { this.rideName = rideName; }
        void showRide() { System.out.println("Ride: " + rideName); }
    }
}
