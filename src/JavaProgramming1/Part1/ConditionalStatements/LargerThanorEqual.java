package JavaProgramming1.Part1.ConditionalStatements;

import java.util.Scanner;

public class LargerThanorEqual {
    public static void main(String[] args) {
        System.out.println("Give the first number:");

        Scanner s1= new Scanner(System.in);
        int n1=s1.nextInt();

        System.out.println("Give the second number:");
        Scanner s2= new Scanner(System.in);
        int n2=s2.nextInt();

        if(n1 > n2 )
            System.out.println("Greater number is: "+n1);

        else
            System.out.println("Greater number is: "+n2);


    }

}
