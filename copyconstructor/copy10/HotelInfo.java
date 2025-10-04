package copyconstructor.copy10;

public class HotelInfo {
    public static void main(String[] args) {
        Hotel h1 = new Hotel("Taj", 200);
        Hotel h2 = new Hotel(h1);
        h1.display();
        h2.display();
    }
}
