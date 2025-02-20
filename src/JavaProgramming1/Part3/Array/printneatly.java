package JavaProgramming1.Part3.Array;


    public class printneatly {
    public static  void main( String[] args){
        int[] array = {5, 1, 3, 4, 2};
        Printn(array);
    }

        public static void Printn(int[] array){

            for (int  i=0;i<array.length;i++) {
                System.out.print(array[i]);

                if (i < array.length - 1) {
                    System.out.print(", ");
                }
            }
        }

}


