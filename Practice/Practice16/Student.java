package Practice.Practice16;
public class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Name: " + name + ", RollNo: " + rollNo + ", College: " + College.collegeName);
    }
}
