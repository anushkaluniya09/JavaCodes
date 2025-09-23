package Practice.Practice18;
public class Teacher {
    String name;
    String subject;

    Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    void showDetails() {
        System.out.println("Name: " + name + ", Subject: " + subject);
    }
}
