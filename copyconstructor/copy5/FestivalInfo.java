package copyconstructor.copy5;

public class FestivalInfo {
    public static void main(String[] args) {
        Festival f1 = new Festival("Diwali", "November");
        Festival f2 = new Festival(f1);
        f1.show();
        f2.show();
    }
}
