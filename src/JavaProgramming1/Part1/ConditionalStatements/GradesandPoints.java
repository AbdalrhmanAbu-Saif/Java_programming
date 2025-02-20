package JavaProgramming1.Part1.ConditionalStatements;

import java.util.Scanner;

public class GradesandPoints {
    public static void main(String[] args) {

        System.out.println("Give points [0-100]:");

        Scanner s1 = new Scanner(System.in);
        int n1 = s1.nextInt();

        if (n1 < 0)
            System.out.println("Grade: impossible!");

        else if (n1 >= 0 && n1 <= 49)
            System.out.println("Grade:failed");

        else if (n1 >= 50 && n1 <= 59)
            System.out.println("Grade : 1");
        else if (n1 >= 60 && n1 <= 69)
            System.out.println("Grade : 2");

        else if (n1 >= 70 && n1 <= 79)
            System.out.println("Grade : 3");

        else if (n1 >= 80 && n1 <= 89)
            System.out.println("Grade : 4");

        else if (n1 >= 90 && n1 <= 100)
            System.out.println("Grade : 5");

        else if (n1 > 100)
            System.out.println("Grade: incredible");



    }

}
