package com.Pojo.Pojo9;

public class Test9 {
    public static void main(String[] args) {
        Department d1 = new Department(1, "Computer Science", "Dr. Sharma");
        Department d2 = new Department();
        d2.setDeptId(2);
        d2.setDeptName("Physics");
        d2.setHod("Prof. Mehta");

        System.out.println(d1);
        System.out.println(d2);
    }
}
