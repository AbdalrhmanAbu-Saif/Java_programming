package JavaProgramming1.Part2.Repeatingfunctionality;

import java.util.Scanner;

public class AreWeThereYet {
    public static void main(String[] args){
        while (true){
            System.out.println("Give a number:");
            Scanner num3= new Scanner(System.in);
            int  number3= num3.nextInt();

            if(number3==4)
                break;
        }

    }
}
