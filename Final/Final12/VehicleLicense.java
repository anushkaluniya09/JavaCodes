package com.Final.Final12;

final class VehicleLicense {
    private String licenseNo;
    private String ownerName;

    public VehicleLicense(String licenseNo, String ownerName) {
        this.licenseNo = licenseNo;
        this.ownerName = ownerName;
    }

    public void showLicense() {
        System.out.println("License No: " + licenseNo + ", Owner: " + ownerName);
    }
}
