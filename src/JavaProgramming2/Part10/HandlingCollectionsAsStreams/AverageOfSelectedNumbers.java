package JavaProgramming2.Part10.HandlingCollectionsAsStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        List<String> inputs = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }

            inputs.add(row);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String s =scanner1.nextLine();
        if(s.equals('n')) {
            long positiveNumber = inputs.stream()
                    .mapToInt(n-> Integer.valueOf(s))
                    .filter(number -> number < 0)
                    .count();

            double average = inputs.stream()
                    .mapToInt(n -> Integer.valueOf(s))
                    .average()
                    .getAsDouble();
            System.out.println("Average f the negative number: " + average);
        } else if(s.equals("P")){
            long positiveNumber = inputs.stream()
                    .mapToInt(n-> Integer.valueOf(s))
                    .filter(number -> number > 0)
                    .count();

            double average = inputs.stream()
                    .mapToInt(n -> Integer.valueOf(s))
                    .average()
                    .getAsDouble();
            System.out.println("Average f the positive  number: " + average);


        }else{
            System.out.println("chose N or P");
        }


    }

}
