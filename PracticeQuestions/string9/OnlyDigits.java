package PracticeQuestions.string9;

public class OnlyDigits {
    public static void main(String[] args) {
        String str = "12345";
        boolean onlyDigits = true;

        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                onlyDigits = false;
                break;
            }
        }

        if (onlyDigits) System.out.println("Only Digits");
        else System.out.println("Contains Non-Digits");
    }
}
