package com.Static.Static8;

class Hotel {
    static class Room {
        int roomNo;
        Room(int roomNo) { this.roomNo = roomNo; }
        void showRoom() { System.out.println("Room Number: " + roomNo); }
    }
}
