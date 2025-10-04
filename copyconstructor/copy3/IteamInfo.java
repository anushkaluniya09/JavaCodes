package copyconstructor.copy3;

public class IteamInfo {
    public static void main(String[] args) {
        Iteam i1 = new Iteam("facewashh", 10);
        Iteam i2 = new Iteam(i1);
        System.out.println(i1);
        System.out.println(i2);
    }
}
