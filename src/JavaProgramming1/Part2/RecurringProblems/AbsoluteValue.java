package JavaProgramming1.Part2.RecurringProblems;

import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args){

        Scanner num1= new Scanner(System.in);

        int  number1= num1.nextInt();

        if(number1<0)
            number1=-1*number1;

        System.out.println(number1);

    }


}
