package JavaProgramming1.Part1.Calculating;

import java.util.Scanner;

public class SecondsInDay {
    public static void main(String[] args) {

        System.out.println("How many days would you like to convert to seconds?");

        Scanner s1 = new Scanner(System.in);
        int S1 = s1.nextInt();

        int calc = S1 * 24 * 60 * 60;
        System.out.println(calc);
    }



}
