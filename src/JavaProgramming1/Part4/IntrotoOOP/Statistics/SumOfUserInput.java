package JavaProgramming1.Part4.IntrotoOOP.Statistics;

import java.util.Scanner;

public class SumOfUserInput {
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        System.out.println("Enter numbers:");
        while (true){

            Scanner num1= new Scanner(System.in);
            int num= num1.nextInt();
            if(num<0)
                break;;
            statistics.addNumber(num);
        }

        System.out.println("Sum: " + statistics.sum());
    }
}
