package com.Static.Static6;

class Company {
    static class Department {
        String deptName;
        Department(String deptName) { this.deptName = deptName; }
        void show() { System.out.println("Department: " + deptName); }
    }
}
