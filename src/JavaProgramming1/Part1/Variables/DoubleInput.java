package JavaProgramming1.Part1.Variables;
import java.util.Scanner;

public class DoubleInput {
    public  static  void  main(String[] args){
        System.out.println("Give a number:");

        Scanner num2= new Scanner(System.in);

        float  number2= num2.nextFloat();
        System.out.println("You gave the number "+number2);
    }
}
