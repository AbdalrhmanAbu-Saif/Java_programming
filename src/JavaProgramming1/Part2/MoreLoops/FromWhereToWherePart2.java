package JavaProgramming1.Part2.MoreLoops;

import java.util.Scanner;

public class FromWhereToWherePart2 {
    public static void main(String[] args) {
        System.out.println("Where to?");
        Scanner num1 = new Scanner(System.in);
        int number1 = num1.nextInt();


        System.out.println("Where from ?");
        Scanner num2 = new Scanner(System.in);
        int number2 = num2.nextInt();

        while (number2 <= number1) {
            System.out.println(number2);
            number2++;
        }
    }
}
