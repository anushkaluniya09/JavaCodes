package Abstraction.Abt9;
public class Abs9 {
    public static void main(String [] args){
        Employee e1=new Developer();
        Employee e2=new Manager();

        e1.work();
        e2.work();
    }
}
