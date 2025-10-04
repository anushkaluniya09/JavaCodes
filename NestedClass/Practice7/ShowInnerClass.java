package NestedClass.Practice7;
public class ShowInnerClass {
    public static void main(String[] args) {
        University uni = new University();
        University.Department d1 = uni.new Department("Computer Science", 300);
        University.Department d2 = uni.new Department("Mathematics", 150);

        d1.display();
        d2.display();

        System.out.println("Total Departments: 2");
    }
}
