package PracticeQuestions.string7;

public class CapitalizeWords {
    public static void main(String[] args) {
        String str = "java programming language";
        String words[] = str.split(" ");
        String result = "";

        for (String w : words) {
            result += Character.toUpperCase(w.charAt(0)) + w.substring(1) + " ";
        }

        System.out.println("Capitalized: " + result.trim());
    }
}
