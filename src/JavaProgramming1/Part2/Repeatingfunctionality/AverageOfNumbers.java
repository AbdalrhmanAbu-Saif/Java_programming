package JavaProgramming1.Part2.Repeatingfunctionality;

import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args){
        int sum=0,cunt=0;
        while (true){
            System.out.println("Give a number:");
            Scanner num1= new Scanner(System.in);
            int  number1= num1.nextInt();

            if (number1==0){
                break;
            }
            cunt++;
            sum+=number1;

        }
        double avg = sum/(cunt*1.0);
        System.out.println("Average of the numbers: "+avg);


    }
}
