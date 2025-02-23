package JavaProgramming1.Part1.ConditionalStatements;
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        System.out.println("Give a number :");

        Scanner s1 = new Scanner(System.in);
        int n1 = s1.nextInt();

        if (n1 > 0)
            System.out.println("The number is positive.");

        else
            System.out.println("The number is not   positive.");
    }
}

