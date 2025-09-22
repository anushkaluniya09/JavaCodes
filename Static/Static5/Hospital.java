package com.Static.Static5;

class Hospital {
    static class Doctor {
        String specialization;
        Doctor(String specialization) { this.specialization = specialization; }
        void info() { System.out.println("Doctor specialization: " + specialization); }
    }
}