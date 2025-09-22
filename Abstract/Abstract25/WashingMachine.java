package com.Abstract.Abstract25;

class WashingMachine extends Appliance {
    public WashingMachine(String applianceName) {
        super(applianceName);
    }

    public void operate() {
        System.out.println(applianceName + " is washing clothes...");
    }
}
