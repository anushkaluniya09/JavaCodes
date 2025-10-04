package defaultconstructor.default14;

public class VehicleInfo {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        System.out.println(v.getVin() + " - " + v.getType());
    }
}
