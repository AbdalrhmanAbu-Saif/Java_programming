package JavaProgramming1.Part3.String;

import java.util.Scanner;

public class PersonalDetails {
    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int mxlength = 0;
    int counter=0,sum=0;
    double avgbirthday;
    String NameMxage = "";
    while (true) {
        String input = reader.nextLine();
        if (input.equals("")) {
            break;
        }
        counter++;

        String[] parts = input.split(",");
        int c = parts[0].length() ;
        sum+=Integer.valueOf(parts[1]);
        if (c > mxlength) {
            mxlength= c;
            NameMxage = "";
            NameMxage = parts[0];
        }
    }

    avgbirthday=sum/(counter*1.0);

    System.out.println("Longest name " + NameMxage);
        System.out.println("Average of the birth years: "+avgbirthday);

    }
}
