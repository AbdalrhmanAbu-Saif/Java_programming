package JavaProgramming1.Part7.Algorithms.Sorting;

import java.util.Arrays; // Add this import

public class SwapNumbers {
    public static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp; // ✅ Fixed assignment
    }

    public static void main(String[] args) {
        int[] numbers = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(numbers)); // ✅ Use Arrays.toString()

        SwapNumbers.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers));

        SwapNumbers.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));
    }
}