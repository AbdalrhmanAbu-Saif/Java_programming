package JavaProgramming1.Part4.IntrotoOOP.Statistics;

import java.util.Scanner;

public class MultipleSums {
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        Statistics StEven = new Statistics();
        Statistics StOdd = new Statistics();
        System.out.println("Enter numbers:");
        while (true){

        Scanner num1= new Scanner(System.in);
        int num= num1.nextInt();
        if(num<0)
            break;;

        statistics.addNumber(num);
        if(num%2==0)
            StEven.addNumber(num);
        else
            StOdd.addNumber(num);
    }

        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + StEven.sum());
        System.out.println("Sum of odd  numbers: " + StOdd.sum());


    }
}
