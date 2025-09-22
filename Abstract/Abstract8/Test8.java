package com.Abstract.Abstract8;

public class Test8 {
    public static void main(String[] args) {
        Course c1 = new JavaCourse();
        Course c2 = new PythonCourse();
        c1.content(); c1.duration();
        c2.content(); c2.duration();
    }
}
