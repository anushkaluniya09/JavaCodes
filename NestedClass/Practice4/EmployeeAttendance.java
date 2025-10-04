package NestedClass.Practice4;
public class EmployeeAttendance {
    public static void main(String[] args) {
        Attendance att = new Attendance() {
            public void mark(String employeeName) {
                System.out.println("Employee: " + employeeName);
                System.out.println("Attendance Marked: PRESENT");
            }
        };

        att.mark("John");
    }
}
