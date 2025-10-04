package PracticeQuestions.operator5;

public class IncrementWithoutPlus {
    public static void main(String[] args) {
        int num = 7;
        int incremented = -~num;  // neat trick: -(~x) = x+1

        System.out.println("Original: " + num);
        System.out.println("After Increment: " + incremented);
    }
}
