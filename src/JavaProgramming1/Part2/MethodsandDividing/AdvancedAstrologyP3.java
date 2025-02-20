package JavaProgramming1.Part2.MethodsandDividing;

public class AdvancedAstrologyP3 {
    public class ChristmasTree {

        public static void christmasTree(int height) {
            for (int i = 1; i <= height; i++) {
                for (int j = 0; j < height - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < (2 * i - 1); j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < height - 2; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 3; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            christmasTree(10);
        }
    }

}
