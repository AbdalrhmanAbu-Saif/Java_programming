package JavaProgramming1.Part3.String;

import java.util.Scanner;

public class Firstwords {

    public static  void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();

        String[] parts = input.split(" ");
    for( String part : parts ){

        System.out.println(part);
        break;

    }

}

}
