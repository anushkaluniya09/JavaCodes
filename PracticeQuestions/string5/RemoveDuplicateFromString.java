package PracticeQuestions.string5;
import java.util.*;
public class RemoveDuplicateFromString {
    public static void main(String[] args) {
        String str = "programming";
        String result = "";
        Set<Character> seen = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (!seen.contains(c)) {
                result += c;
                seen.add(c);
            }
        }

        System.out.println("Without Duplicates: " + result);
    }
}
