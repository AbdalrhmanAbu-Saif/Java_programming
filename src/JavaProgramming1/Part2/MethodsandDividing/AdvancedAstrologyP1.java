package JavaProgramming1.Part2.MethodsandDividing;

public class AdvancedAstrologyP1 {
    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("Testing printSpaces(5): ");
        printSpaces(5);
        System.out.println("<- End of spaces");

        System.out.print("Testing printStars(3): ");
        printStars(3);
    }
}
