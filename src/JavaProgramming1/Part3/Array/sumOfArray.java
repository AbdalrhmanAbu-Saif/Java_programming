package JavaProgramming1.Part3.Array;

public class sumOfArray {
    public static int sumOfNumbersInArray(int[] array){
        int  total=0;
        for(int i=0;i<array.length;i++)
            total+=array[i];

        return  total;
    }
    public static  void main( String[] args) {

        int[] numbers = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(numbers));;

    }
}
