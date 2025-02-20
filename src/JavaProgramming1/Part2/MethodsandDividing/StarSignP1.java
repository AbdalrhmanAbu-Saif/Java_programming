package JavaProgramming1.Part2.MethodsandDividing;

public class StarSignP1 {
    public static void printStars(int number) {

        for (int  i =1;i<=number;i++){
            System.out.print("*");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);

    }

}
