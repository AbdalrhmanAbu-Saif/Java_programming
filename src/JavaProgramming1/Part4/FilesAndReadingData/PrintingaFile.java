package JavaProgramming1.Part4.FilesAndReadingData;

import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingaFile {
    public static void main(String[] args){

        try (Scanner scanner = new Scanner(Paths.get("/home/trainee1/source/lit-2410/Java Prgramming/src/JavaProgramming1/Part4/FilesAndReadingData/data.txt"))) {

            // we read the file until all lines have been read
            while (scanner.hasNextLine()) {
                // we read one line
                String row = scanner.nextLine();
                // we print the line that we read
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
