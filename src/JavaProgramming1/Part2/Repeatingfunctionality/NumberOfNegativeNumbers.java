package JavaProgramming1.Part2.Repeatingfunctionality;

import java.util.Scanner;

public class NumberOfNegativeNumbers {
    public static void  main(String[] args){


        int counter=0;
        while (true){
            System.out.println("Give a number:");
            Scanner num1= new Scanner(System.in);
            int  number1= num1.nextInt();

            if (number1==0){
                break;
            }
            if (number1<0)
                counter++;
        }
        System.out.println("Number of negative numbers: "+counter);

    }
}
