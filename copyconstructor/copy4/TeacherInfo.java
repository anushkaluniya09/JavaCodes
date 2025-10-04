package copyconstructor.copy4;

public class TeacherInfo {
    public static void main(String[] args) {
        TeacherAssistant ta1 = new TeacherAssistant("Ramesh", 2025);
        TeacherAssistant ta2 = new TeacherAssistant(ta1);
        ta1.show();
        ta2.show();
    }
}

