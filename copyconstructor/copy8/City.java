package copyconstructor.copy8;

public class City {
    String name;
    int population;

    City(String n, int p) {
        name = n;
        population = p;
    }

    City(City c) {
        name = c.name;
        population = c.population;
    }

    void show() {
        System.out.println("City: " + name + ", Population: " + population);
    }
}
