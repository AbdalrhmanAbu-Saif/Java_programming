package JavaProgramming1.Part1.ReadingInput;

import java.util.Scanner;

public class HiAdalovelace {
    public  static void  main(String[] args){

        System.out.println("Write a message: ");
        Scanner scanner1 =new Scanner(System.in);

        String name = scanner1.nextLine();

        System.out.println("Hi "+name);
    }
}
