package com.Final.Final20;

final class DigitalPass {
    private String passId;
    private String event;

    public DigitalPass(String passId, String event) {
        this.passId = passId;
        this.event = event;
    }

    public void showPass() {
        System.out.println("Digital Pass " + passId + " for event: " + event);
    }
}
