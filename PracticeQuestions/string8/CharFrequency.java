package PracticeQuestions.string8;
import java.util.*;
public class CharFrequency {
    public static void main(String[] args) {
        String str = "hello world";
        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (c != ' ') { // ignore spaces
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
