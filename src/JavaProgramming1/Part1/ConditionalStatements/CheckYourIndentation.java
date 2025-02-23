package JavaProgramming1.Part1.ConditionalStatements;

import java.util.Scanner;

public class CheckYourIndentation {
    public static void main(String[] args) {

        System.out.println("Give a number:");

        Scanner s1 = new Scanner(System.in);
        int n1 = s1.nextInt();

        if (n1 == 1984) {
            System.out.println("Orwell");
        }

    }

}
