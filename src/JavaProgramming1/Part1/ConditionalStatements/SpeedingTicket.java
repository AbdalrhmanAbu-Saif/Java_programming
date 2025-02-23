package JavaProgramming1.Part1.ConditionalStatements;
import java.util.Scanner;

public class SpeedingTicket {
    public static void main(String[] args){
        System.out.println("Give speed:");

        Scanner s1= new Scanner(System.in);
        int n1=s1.nextInt();

        if(n1>120){
            System.out.println("Speeding ticket!\n");
        }
    }
}
