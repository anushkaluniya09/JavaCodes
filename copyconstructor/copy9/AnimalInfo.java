package copyconstructor.copy9;

public class AnimalInfo {
    public static void main(String[] args) {
        Animal a1 = new Animal("Dog", 5);
        Animal a2 = new Animal(a1);
        a1.display();
        a2.display();
    }
}
