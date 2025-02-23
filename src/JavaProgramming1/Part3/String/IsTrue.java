package JavaProgramming1.Part3.String;

import java.util.Scanner;

public class IsTrue {
    public static  void main( String[] args){
        System.out.print("Give  a string: ");

        Scanner s1= new Scanner(System.in);
        String str= s1.nextLine();


        if(str.equals("true"))
            System.out.println("You got  it   right!");
        else
            System.out.println("Try Again!");
    }
}
