package PracticeQuestions.operator3;

public class OppositeSigns {
    public static void main(String[] args) {
        int x = 5, y = -10;

        if ((x ^ y) < 0) {
            System.out.println(x + " and " + y + " have Opposite Signs");
        } else {
            System.out.println(x + " and " + y + " have Same Sign");
        }
    }
}
