package Abstraction.Abt5;
public class Abs5 {
    public static void main(String[] args){
        Course java=new JavaCourse();
        Course python=new PythonCourse();
        java.courseName();
        java.duration();
        python.courseName();
        python.duration();
    }
}
