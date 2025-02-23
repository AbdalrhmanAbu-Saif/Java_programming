package JavaProgramming1.Part1.ReadingInput;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("Write  Something: ");
        Scanner s1 = new Scanner(System.in);
        String s = s1.nextLine();

        System.out.println("You  wrote " + s);
    }
}
