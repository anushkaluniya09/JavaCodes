package PracticeQuestions.string4;
import java.util.*;
public class FirstNonRepeated {
    public static void main(String[] args) {
        String str = "swiss";
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First Non-Repeated: " + entry.getKey());
                return;
            }
        }
        System.out.println("No unique character found");
    }
}
