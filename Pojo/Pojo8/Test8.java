package com.Pojo.Pojo8;

public class Test8 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher(101, "Anushka", "Maths");
        Teacher t2 = new Teacher();
        t2.setTeacherId(102);
        t2.setName("Nikita");
        t2.setSubject("Science");

        System.out.println(t1);
        System.out.println(t2);
    }
}
