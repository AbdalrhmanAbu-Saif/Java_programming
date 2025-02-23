package JavaProgramming1.Part2.RecurringProblems;

import java.util.Scanner;

public class ComparingNumbers {
    public static void main(String[] args) {

        Scanner num1= new Scanner(System.in);

        int  number1= num1.nextInt();
        Scanner num2= new Scanner(System.in);

        int  number2= num2.nextInt();

        if(number1>number2)
            System.out.println(number1+" is greater than "+number2);
        else if (number2>number1)
            System.out.println(number1+" is smaller than "+number2);

        else
            System.out.println(number1+" is equal than "+number2);
    }

}
