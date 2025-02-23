package JavaProgramming1.Part1.ConditionalStatements;
import java.util.Scanner;

public class Ancient {
    public static void main(String[] args) {
        System.out.println("Give a year:");

        Scanner s1= new Scanner(System.in);
        int n1=s1.nextInt();

        if(n1<2015) {
            System.out.println("Ancient history!");
        }
    }
}
