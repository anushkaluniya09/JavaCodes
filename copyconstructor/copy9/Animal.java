package copyconstructor.copy9;

public class Animal {
    String species;
    int age;

    Animal(String s, int a) {
        species = s;
        age = a;
    }

    Animal(Animal an) {
        species = an.species;
        age = an.age;
    }

    void display() {
        System.out.println("Species: " + species + ", Age: " + age);
    }
}
