package JavaProgramming1.Part7.Algorithms.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sorting {

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int sm = table[startIndex];
        int index=startIndex;

        for (int i = startIndex; i < table.length; i++){
            if (table[i] < sm) {
                sm = table[i];
                index = i;
            }
        }
        return index;
    }
    public static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp; // ✅ Fixed assignment
    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));

        for (int i= 0 ; i<array.length;i++){
            int smallindex=indexOfSmallestFrom(array,i);
            swap(array,i,smallindex);

            System.out.println(Arrays.toString(array));

        }
    }

    public static void main(String[] args){
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(Arrays.toString(numbers));
        Sorting.sort(numbers);

    }
}
