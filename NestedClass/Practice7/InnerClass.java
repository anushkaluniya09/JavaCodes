package NestedClass.Practice7;
class University {
    class Department {
        String name;
        int students;

        Department(String name, int students) {
            this.name = name;
            this.students = students;
        }

        void display() {
            System.out.println("Department: " + name + " - Students: " + students);
        }
    }
}
