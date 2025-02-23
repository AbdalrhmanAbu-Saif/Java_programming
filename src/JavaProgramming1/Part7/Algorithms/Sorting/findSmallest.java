package JavaProgramming1.Part7.Algorithms.Sorting;

public class findSmallest {
    public static int smallest(int[] array){
        int sm=array[0];

        for (int n :array){
            if(n<sm)
                sm=n;
        }
        return  sm;
    }

    public static void main(String[] args){
        int[] numbers = {6, 5, 8, 7, 11};
        System.out.println("Smallest: " + findSmallest.smallest(numbers));
    }
}
