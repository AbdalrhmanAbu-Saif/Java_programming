package JavaProgramming1.Part4.FilesAndReadingData.PrintingaSpecifiedFile;

import java.util.Scanner;
import java.nio.file.Paths;

public class PrintingaSpecifiedFile {
    public static void main(String[] args) {
        System.out.println("Which file should have its contents printed?");

        Scanner nfile = new Scanner(System.in);

        String str = nfile.nextLine();

        if (str.equals("song.txt")) {

            try(Scanner scanner = new Scanner(Paths.get("/home/trainee1/source/lit-2410/Java Prgramming/src/JavaProgramming1/Part4/FilesAndReadingData/PrintingaSpecifiedFile/song.txt"))) {
                while (scanner.hasNextLine()) {
                    String row = scanner.nextLine();
                    System.out.println(row);
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        else if(str.equals("data.txt")){
            try(Scanner scanner = new Scanner(Paths.get("/home/trainee1/source/lit-2410/Java Prgramming/src/JavaProgramming1/Part4/FilesAndReadingData/PrintingaSpecifiedFile/data.txt"))) {
                while (scanner.hasNextLine()) {
                    String row = scanner.nextLine();
                    System.out.println(row);
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
