package JavaProgramming1.Part2.Repeatingfunctionality;

import java.util.Scanner;

public class AverageOfPositiveNumbers {
    public static void main(String[] args){

        int sum=0,cunt=0;
        while (true){

            Scanner num1= new Scanner(System.in);
            int  number1= num1.nextInt();

            if (number1==0){
                break;
            }
            if(number1>0) {
                cunt++;
                sum += number1;
            }
        }
        if(cunt==0)
            System.out.println("Cannot calculate the average");
        double avg = sum/(cunt*1.0);
        System.out.println(avg);
    }
}
