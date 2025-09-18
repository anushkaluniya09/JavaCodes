package Encapsulation.Enp5;
public class Enc5 {
    public static void main(String[] args){
        Book obj=new Book("Java Programming","James Gosling",900);
        System.out.println(obj.getTitle());
        System.out.println(obj.getAuthor());
        System.out.println(obj.getPrice());
    }
}
