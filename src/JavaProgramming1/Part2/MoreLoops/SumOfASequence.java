package JavaProgramming1.Part2.MoreLoops;

import java.util.Scanner;

public class SumOfASequence {
    public static void main(String[] args) {
        System.out.println("Last number?");
        int sum = 0;
        Scanner num1 = new Scanner(System.in);
        int number1 = num1.nextInt();

        for (int i = 1; i <= number1; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
