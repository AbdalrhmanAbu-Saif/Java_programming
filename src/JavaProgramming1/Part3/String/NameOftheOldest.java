package JavaProgramming1.Part3.String;

import java.util.Scanner;

public class NameOftheOldest {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int mx=0;
        String NameMxage="";
        while (true) {
            String input = reader.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            int c= Integer.valueOf(parts[1]);
            if(c>mx) {
                mx = c;
                NameMxage="";
                NameMxage=parts[0];
            }
        }


        System.out.println("Name of the oldest: " + NameMxage);


    }

}
