package JavaProgramming1.Part1.ConditionalStatements;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        System.out.println("Give a year: ");

        Scanner s1= new Scanner(System.in);

        int  n1=s1.nextInt();

        if((n1%4==0 && n1%100!=0 )||n1%400==0)
            System.out.println("The year is a leap year.");
        else
            System.out.println("The year is not  a leap year");
    }
}
