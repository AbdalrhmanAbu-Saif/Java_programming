package JavaProgramming1.Part2.MoreLoops;

import java.util.Scanner;

public class SumOfaSequenceTheSequel {
    public static void main(String[] args) {

        int sum = 0;
        System.out.println("First number?");
        Scanner num1 = new Scanner(System.in);
        int number1 = num1.nextInt();


        System.out.println("Last number?");
        Scanner num2 = new Scanner(System.in);
        int number2 = num2.nextInt();

        while (number1 <= number2) {
            sum += number1;
            number1++;
        }
        System.out.println("the  sum is  " + sum);
    }

}
