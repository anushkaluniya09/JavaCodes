package com.Static.Static7;

class College {
    static class Course {
        String courseName;
        Course(String courseName) { this.courseName = courseName; }
        void showCourse() { System.out.println("Course: " + courseName); }
    }
}
