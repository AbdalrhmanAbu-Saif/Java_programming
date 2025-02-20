package JavaProgramming1.Part1.ReadingInput;

import java.util.Scanner;

public class MessageThreeTime {
    public static void main(String[] args) {
        System.out.println("Write a message: ");
        Scanner scanner2 =new Scanner(System.in);

        String msg = scanner2.nextLine();

        System.out.println(msg);
        System.out.println(msg);
        System.out.println(msg);

    }

}
