package JavaProgramming1.Part1.Variables;

import java.util.Scanner;

public class DifferentTypesInput {
    public static void main(String[] args){

        System.out.println("Give a string:");
        Scanner str= new Scanner(System.in);
        String  string= str.nextLine();

        System.out.println("Give an integer : ");
        Scanner num= new Scanner(System.in);
        int Num= num.nextInt();

        System.out.println("Give a double:");
        Scanner doub= new Scanner(System.in);
        double Doub= doub.nextDouble();


        System.out.println("Give a boolean:");
        Scanner bool= new Scanner(System.in);
        boolean Bool= bool.nextBoolean();

        System.out.println("You gave the string "+string+"\n"+
                "You gave the integer "+Num+"\n"+
                "You gave the double "+Doub+"\n"+
                "You gave the boolean "+Bool


        );
    }
}
