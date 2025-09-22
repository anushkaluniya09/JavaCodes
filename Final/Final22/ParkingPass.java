package com.Final.Final22;

final class ParkingPass {
    private String passNumber;
    private String vehicleNumber;

    public ParkingPass(String passNumber, String vehicleNumber) {
        this.passNumber = passNumber;
        this.vehicleNumber = vehicleNumber;
    }

    public void showPass() {
        System.out.println("Parking Pass " + passNumber + " for vehicle " + vehicleNumber);
    }
}
