package defaultconstructor.default16;

public class GameCharacter {
    String name;
    int health;

    GameCharacter() {
        name = "Warrior";
        health = 100;
    }

    void stats() {
        System.out.println("Character: " + name + ", Health: " + health);
    }

}
