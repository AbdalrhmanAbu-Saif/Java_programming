package JavaProgramming1.Part2.RecurringProblems;

import java.util.Scanner;

public class SquarRootOfSum {
    public static void main(String[] args){
        Scanner num1= new Scanner(System.in);

        int  number1= num1.nextInt();
        Scanner num2= new Scanner(System.in);

        int  number2= num2.nextInt();

        int  number3=number1+number2;
        System.out.println(Math.sqrt(number3));
    }

}
