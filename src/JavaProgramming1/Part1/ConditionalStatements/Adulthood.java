package JavaProgramming1.Part1.ConditionalStatements;

import java.util.Scanner;

public class Adulthood {
    public static void main(String[] args){
        System.out.print("How old are you?\n");

        Scanner age= new Scanner(System.in);
        int AGE= age.nextInt();
        if(AGE>=18)
            System.out.println("You are an adult");
        else
            System.out.println("You are not an adult");

    }
}
