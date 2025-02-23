package JavaProgramming1.Part3.String;

import java.util.Scanner;

public class LastWord { public static  void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();

    String[] parts = input.split(" ");

    int lst=parts.length-1;
    System.out.println(parts[lst]);
   }
}
