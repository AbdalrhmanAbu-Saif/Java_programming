package JavaProgramming1.Part1.ConditionalStatements;

import java.util.Scanner;

public class OddorEven {

    public static void main(String[] args) {

        System.out.println("Give a number:\n");
        Scanner s1= new Scanner(System.in);
        int n1=s1.nextInt();

        if(n1 %2==0)
            System.out.println("Number "+n1 +"is even");

        else
            System.out.println("Number "+n1 +" is odd");

    }
}
