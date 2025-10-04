package defaultconstructor.default1;

public class Student {
    int rollNo;
    String name;

    Student() { // Default constructor
        rollNo = 46;
        name = "Anushka Luniya";
    }

    void show() {
        System.out.println("RollNo: " + rollNo + ", Name: " + name);
    }

}
