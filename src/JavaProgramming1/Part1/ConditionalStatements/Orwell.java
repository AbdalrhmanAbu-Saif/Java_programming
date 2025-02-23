package JavaProgramming1.Part1.ConditionalStatements;

import java.util.Scanner;

public class Orwell {
    public static void main(String[] args) {

        System.out.println("Give a number:");

        Scanner N1 = new Scanner(System.in);
        int S1 = N1.nextInt();

        if (S1 ==1984) {
            System.out.println("Orwel");
        }
    }
}
