package com.Concrete.Concrete1;

class Device {
    private String deviceName;
    private String brand;
    private boolean isOn;

    public Device(String deviceName, String brand) {
        this.deviceName = deviceName;
        this.brand = brand;
        this.isOn = false;
    }

    public void switchOn() {
        isOn = true;
        System.out.println(deviceName + " by " + brand + " is now ON");
    }
}
