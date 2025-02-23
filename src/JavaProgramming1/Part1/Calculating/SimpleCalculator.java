package JavaProgramming1.Part1.Calculating;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        System.out.println("Give the first number:");

        Scanner s1= new Scanner(System.in);
        int n1=s1.nextInt();

        System.out.println("Give the second number:");
        Scanner s2= new Scanner(System.in);
        int n2=s2.nextInt();
        System.out.println(n1+" - "+n2 +" = "+(n1-n2));
        System.out.println(n1+" * "+n2 +" = "+(n1*n2));
        System.out.println(n1+" / "+n2 +" = "+(n1/(n2*1.0)));



    }

}
