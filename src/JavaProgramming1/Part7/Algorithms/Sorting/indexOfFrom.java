package JavaProgramming1.Part7.Algorithms.Sorting;

public class indexOfFrom {
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


    public static void main(String[] args){
        // indices:       0  1  2  3   4
        int[] numbers = {-1, 6, 9, 8, 12};
        System.out.println(indexOfFrom.indexOfSmallestFrom(numbers, 0));
        System.out.println(indexOfFrom.indexOfSmallestFrom(numbers, 1));
        System.out.println(indexOfFrom.indexOfSmallestFrom(numbers, 2));
    }

}
