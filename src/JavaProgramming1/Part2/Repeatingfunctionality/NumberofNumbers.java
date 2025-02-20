package JavaProgramming1.Part2.Repeatingfunctionality;

import java.util.Scanner;

public class NumberofNumbers {

        public static void  main(String[] args){
            int i ;
            for (i=1;i>0;i++){
                System.out.println("Give a number:");
                Scanner num1= new Scanner(System.in);
                int  number1= num1.nextInt();

                if (number1==0){
                    i--;
                    break;
                }
            }
            System.out.println("Number of numbers: "+i);

        }

}
