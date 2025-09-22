package com.Concrete.Concrete2;

class Event {
    private String eventName;
    private String location;
    private int attendees;

    public Event(String eventName, String location, int attendees) {
        this.eventName = eventName;
        this.location = location;
        this.attendees = attendees;
    }

    public void showInfo() {
        System.out.println(eventName + " at " + location + " has " + attendees + " attendees");
    }
}
