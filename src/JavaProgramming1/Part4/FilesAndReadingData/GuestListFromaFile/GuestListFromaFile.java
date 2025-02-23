package JavaProgramming1.Part4.FilesAndReadingData.GuestListFromaFile;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromaFile {
    public static void main(String[] args) {

        ArrayList<String> names= new ArrayList<>();
        System.out.println("Name of the file:");
        Scanner string= new Scanner(System.in);
        String str = string.nextLine();

        if(str.equals("names.txt")) {
            try (Scanner scanner = new Scanner(Paths.get("/home/trainee1/source/lit-2410/Java Prgramming/src/JavaProgramming1/Part4/FilesAndReadingData/GuestListFromaFile/names.txt"))) {

                // we read all the lines of the file
                while (scanner.hasNextLine()) {
                    names.add(scanner.nextLine());
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        System.out.println("Enter names, an empty line quits.");
        while (true){

            Scanner name= new Scanner(System.in);
            String str1= name.nextLine();
            if (str1.isEmpty())
                break;
            else{
                if(names.contains(str1))
                    System.out.println("The name is  on the list");
                else
                    System.out.println("The name is not on the list.");
            }
        }



    }
}
