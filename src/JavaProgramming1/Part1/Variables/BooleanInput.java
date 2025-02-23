package JavaProgramming1.Part1.Variables;

import java.util.Scanner;

public class BooleanInput {

    public static void  main(String[] args){

        System.out.println("Write something: ");

        Scanner something1= new Scanner(System.in);
        String  some1= something1.nextLine();

        System.out.print("True or false?");
        Scanner something2= new Scanner(System.in);
        boolean  some2= something2.nextBoolean();

    }
}
