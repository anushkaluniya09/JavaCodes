package com.Pojo.Pojo1;

public class Test1 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Anushka", 21);
        Student s2 = new Student();
        s2.setId(2);
        s2.setName("Nikita");
        s2.setAge(21);

        System.out.println(s1);
        System.out.println(s2);
    }
}

