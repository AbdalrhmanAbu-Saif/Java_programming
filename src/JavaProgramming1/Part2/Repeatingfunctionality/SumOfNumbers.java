package JavaProgramming1.Part2.Repeatingfunctionality;

import java.util.Scanner;

public class SumOfNumbers {
    public static void  main(String[] args){

        int sum=0;
        while (true){
            System.out.println("Give a number:");
            Scanner num1= new Scanner(System.in);
            int  number1= num1.nextInt();

            if (number1==0){
                break;
            }
            sum+=number1;

        }
        System.out.println("Sum of the numbers: "+sum);

    }
}
