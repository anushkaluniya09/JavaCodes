package Practice.Practice7;

public class PersonInfo {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Alice");
        p.setAge(25);

        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}
