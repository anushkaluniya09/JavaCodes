package com.Final.Final24;

final class SmartHomeDevice {
    private String deviceName;
    private boolean status;

    public SmartHomeDevice(String deviceName, boolean status) {
        this.deviceName = deviceName;
        this.status = status;
    }

    public void showStatus() {
        System.out.println("Device: " + deviceName);
        System.out.println("Status: " + (status ? "ON" : "OFF"));
    }
}
