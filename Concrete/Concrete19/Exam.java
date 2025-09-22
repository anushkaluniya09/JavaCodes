package com.Concrete.Concrete19;

class Exam {
    private String subject;
    private int maxMarks;

    public Exam(String subject, int maxMarks) {
        this.subject = subject;
        this.maxMarks = maxMarks;
    }

    public void display() {
        System.out.println("Exam Subject: " + subject);
        System.out.println("Max Marks: " + maxMarks);
    }
}
