package JavaProgramming1.Part4.FilesAndReadingData.RecordsFromaFile;

import java.io.IOException;
import java.nio.Buffer;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromFile {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String filename = inputScanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get("/home/trainee1/source/lit-2410/Java Prgramming/src/JavaProgramming1/Part4/FilesAndReadingData/RecordsFromaFile/data.txt"))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().trim();
                if (line.isEmpty()) continue;

                String[] parts = line.split(",", 2);
                if (parts.length != 2) continue;

                String name = parts[0].trim();
                String ageString = parts[1].trim();

                try {
                    int age = Integer.parseInt(ageString);
                    String yearForm = age == 1 ? "year" : "years";
                    System.out.printf("%s, age: %d %s%n", name, age, yearForm);
                } catch (NumberFormatException e) {
                    // Skip invalid age format
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
