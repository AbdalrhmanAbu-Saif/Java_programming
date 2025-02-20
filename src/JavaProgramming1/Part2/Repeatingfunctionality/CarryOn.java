package JavaProgramming1.Part2.Repeatingfunctionality;

import java.util.Scanner;

public class CarryOn {
    public static void main(String[] args) {

        while (true){
            System.out.println("Shall we carry on?");
            Scanner str1= new Scanner(System.in);

            String  string1= str1.nextLine();

            if(string1.equals("no"))
                break;
        }

    }
}
