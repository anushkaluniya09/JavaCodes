package com.Static.Static3;

class School {
    static class Teacher {
        String subject;
        Teacher(String subject) { this.subject = subject; }
        void teach() { System.out.println("Teaching " + subject); }
    }
}
