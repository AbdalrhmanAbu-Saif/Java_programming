package JavaProgramming1.Part2.MoreLoops;

import java.util.Scanner;

public class RepeatingBreakingandRememberingP1 {
    public static void main(String[] args) {
        System.out.println("Give a number: ");
        while (true){
            Scanner num1 = new Scanner(System.in);
            int number1 = num1.nextInt();

            if(number1==-1)
                break;

        }
        System.out.println("Thx! Bye!");
    }
}
