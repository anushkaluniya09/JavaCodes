package com.Pojo.Pojo8;

class Teacher {
    private int teacherId;
    private String name;
    private String subject;

    public Teacher() {}
    public Teacher(int teacherId, String name, String subject) {
        this.teacherId = teacherId;
        this.name = name;
        this.subject = subject;
    }

    public int getTeacherId() { return teacherId; }
    public void setTeacherId(int teacherId) { this.teacherId = teacherId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    @Override
    public String toString() {
        return "Teacher [teacherId=" + teacherId + ", name=" + name + ", subject=" + subject + "]";
    }
}
