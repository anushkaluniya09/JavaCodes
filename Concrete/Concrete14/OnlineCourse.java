package com.Concrete.Concrete14;

class OnlineCourse {
    private String courseName;
    private String instructor;
    private int hours;

    public OnlineCourse(String courseName, String instructor, int hours) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.hours = hours;
    }

    public void showCourse() {
        System.out.println(courseName + " by " + instructor + " has " + hours + " hours");
    }
}
