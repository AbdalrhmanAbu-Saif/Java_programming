package JavaProgramming1.Part1.ConditionalStatements;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        System.out.println("Password?");
        String  pass = "Caput Draconis";
        Scanner s1= new Scanner(System.in);
        String n1=s1.nextLine();

        if(n1.equals(pass))
            System.out.println("Welcome!");
        else
            System.out.println("Off with you!");

    }
}
