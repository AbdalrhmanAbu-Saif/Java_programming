package JavaProgramming1.Part1.ConditionalStatements;

import java.util.Scanner;

public class Same {
    public static void main(String[] args) {

        System.out.println("Enter the first string:");

        Scanner s1= new Scanner(System.in);
        String n1=s1.nextLine();

        System.out.println("Enter the second string:");

        Scanner s2= new Scanner(System.in);
        String n2=s2.nextLine();

        if(n1.equals(n2))
            System.out.println("Same");
        else
            System.out.println("Different");
    }

    }
