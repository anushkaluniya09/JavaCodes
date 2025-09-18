package Polymorphism.Poly9;
public class P9 {
    public static void main(String[] args){
        Library l1=new Library();
        l1.search("Java");
        l1.search(202);

        Library l2=new OnlineLibrary();
        l2.search("Machine Learning");
    }
}
