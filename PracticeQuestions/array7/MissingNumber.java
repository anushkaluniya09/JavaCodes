package PracticeQuestions.array7;

public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5}; // Missing 3
        int n = 5; // 1 to 5

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) actualSum += num;

        System.out.println("Missing Number: " + (expectedSum - actualSum));
    }
}
