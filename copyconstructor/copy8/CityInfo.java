package copyconstructor.copy8;

public class CityInfo {
    public static void main(String[] args) {
        City c1 = new City("Delhi", 19000000);
        City c2 = new City(c1);
        c1.show();
        c2.show();
    }
}
