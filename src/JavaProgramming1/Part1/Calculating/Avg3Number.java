package JavaProgramming1.Part1.Calculating;

import java.util.Scanner;

public class Avg3Number {
    public static void main(String[] args) {
        System.out.println("Give the first number:");

        Scanner s1= new Scanner(System.in);
        int n1=s1.nextInt();

        System.out.println("Give the second number:");
        Scanner s2= new Scanner(System.in);
        int n2=s2.nextInt();

        System.out.println("Give the third number:");
        Scanner s3= new Scanner(System.in);
        int n3=s3.nextInt();
        double avg= (n1+n2+n3)/3.0;
        System.out.println("The average is  "+avg);
    }

}
