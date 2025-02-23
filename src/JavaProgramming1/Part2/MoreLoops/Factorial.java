package JavaProgramming1.Part2.MoreLoops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int fac=1;
        System.out.println("Give a number: ");
        Scanner num1 = new Scanner(System.in);
        int number1 = num1.nextInt();
        while (number1>0){
            fac*=number1;
            number1--;
        }
        System.out.println("Factorial: "+fac);
    }
}
