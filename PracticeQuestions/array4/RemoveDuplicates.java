package PracticeQuestions.array4;
import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 30, 40, 40, 50};
        Set<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.println("Array without Duplicates: " + set);
    }
}
