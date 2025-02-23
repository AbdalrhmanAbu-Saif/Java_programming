package JavaProgramming1.Part2.MethodsandDividing;

public class StarSignP3 {

    public static void printRectangle(int width, int height) {

        for (int  i =1;i<=height;i++){
            for(int j=1;j<=width;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        printRectangle(17,3);
    }
}
