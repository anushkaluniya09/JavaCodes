package PracticeQuestions.string10;

public class ReplaceSpaces {
    public static void main(String[] args) {
        String str = "java is fun";
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') chars[i] = '-';
        }

        String result = new String(chars);
        System.out.println("After Replacing: " + result);
    }
}
