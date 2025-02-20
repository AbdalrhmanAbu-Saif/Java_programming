package JavaProgramming1.Part2.MoreLoops;

import java.util.Scanner;

public class CountingToHundred {
    public static void main(String[] args){
        Scanner num1= new Scanner(System.in);
        int  number1= num1.nextInt();
        while (number1<=100){
            System.out.println(number1);
            number1++;
        }

    }
}
