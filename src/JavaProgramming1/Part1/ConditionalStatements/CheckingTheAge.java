package JavaProgramming1.Part1.ConditionalStatements;

import java.util.Scanner;

public class CheckingTheAge {
    public static void main(String[] args) {
        System.out.println("How  old are  you ? ");

        Scanner s1= new Scanner(System.in);
        int  n1=s1.nextInt();

        if(n1>0 && n1<=120)
            System.out.println("OK");
        else

            System.out.println("Impossible!");

    }

}
