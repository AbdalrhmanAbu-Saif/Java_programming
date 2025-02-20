package JavaProgramming1.Part2.MethodsandDividing;

public class StarSignP4 {
    public static void printTriangle(int size) {

        for (int  i =1;i<=size;i++){
            for(int j=1;j<=size;j++){
                if(j<=i)
                    System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        printTriangle(4);
    }

}
