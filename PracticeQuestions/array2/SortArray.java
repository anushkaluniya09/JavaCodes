package PracticeQuestions.array2;

public class SortArray {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 8};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Ascending Order: ");
        for (int x : arr) System.out.print(x + " ");

        System.out.print("\nDescending Order: ");
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
