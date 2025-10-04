package copyconstructor.copy10;

public class Hotel {
    String name;
    int rooms;

    Hotel(String n, int r) {
        name = n;
        rooms = r;
    }

    Hotel(Hotel h) {
        name = h.name;
        rooms = h.rooms;
    }

    void display() {
        System.out.println("Hotel: " + name + ", Rooms: " + rooms);
    }

}
