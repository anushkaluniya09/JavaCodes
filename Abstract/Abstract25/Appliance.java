package com.Abstract.Abstract25;

abstract class Appliance {
    protected String applianceName;

    public Appliance(String applianceName) {
        this.applianceName = applianceName;
    }

    public abstract void operate();

    public void displayName() {
        System.out.println("Appliance: " + applianceName);
    }
}
