package Practice.Practice4;

public class Student {
    int rollNo;
    String name;
    int marks;
    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    void displayDetails() {
        System.out.println("RollNo: " + rollNo + ", Name: " + name + ", Marks: " + marks);
    }
}
