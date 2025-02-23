package JavaProgramming1.Part1.Variables;

import java.util.Scanner;

public class IntegerInput {
    public  static void  main(String[] args){
        System.out.println("Give a number:");

        Scanner num1= new Scanner(System.in);

        int  number1= num1.nextInt();
        System.out.println("You gave the number "+number1);

    }



}
