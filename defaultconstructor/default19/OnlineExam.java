package defaultconstructor.default19;

public class OnlineExam {
    String subject;
    int totalMarks;

    OnlineExam() {
        subject = "Computer Network";
        totalMarks = 100;
    }

    void show() {
        System.out.println("Subject: " + subject + ", Marks: " + totalMarks);
    }
}
