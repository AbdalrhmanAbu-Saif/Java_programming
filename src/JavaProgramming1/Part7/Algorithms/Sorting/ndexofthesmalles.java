package JavaProgramming1.Part7.Algorithms.Sorting;

public class ndexofthesmalles {
    public static int indexOfSmallest(int[] array) {
        int sm = array[0];
        int index=0;
        for (int i = 0; i < array.length; i++){
            if (array[i] < sm) {
                sm = array[i];
                index = i;
            }
        }
        return index;
        }

    public static void main(String[] args){

        // indices:      0  1  2  3  4
        int[] numbers = {6, 5, 8, 7, 11};
        System.out.println("Index of the smallest number: " + ndexofthesmalles.indexOfSmallest(numbers));
    }




    }


