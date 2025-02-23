package JavaProgramming1.Part1.ConditionalStatements;

import java.util.Scanner;

public class GiftTax {
    public static void main(String[] args) {

        System.out.println("Value of the gift? ");
        Scanner s1= new Scanner(System.in);

        int  n1=s1.nextInt();

        double tax=0;
        if (n1 >=5000 && n1 <25000){
            tax =(100 +(n1-5000)*0.08);
            System.out.println("Tax: "+tax);


        }

        else if (n1 >=25000 && n1 <55000){
            tax =(1700 +(n1-25000)*0.10);
            System.out.println("Tax: "+tax);

        }

        else if (n1 >=55000 && n1 <200000){
            tax =(4700 +(n1-55000)*0.12);
            System.out.println("Tax: "+tax);

        }

        else if (n1 >=200000 && n1 <1000000){
            tax =(22100 +(n1-200000)*0.15);
            System.out.println("Tax: "+tax);

        }

        else if (n1 >=1000000){
            tax =(142100 +(n1-25000)*0.10);
            System.out.println("Tax: "+tax);

        }
        else
            System.out.println("No tax!");

    }
}
