package PracticeQuestions.array9;

public class SumArray {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40};
        int sum = 0;

        for (int num : arr) sum += num;

        System.out.println("Sum of Elements: " + sum);
    }
}
