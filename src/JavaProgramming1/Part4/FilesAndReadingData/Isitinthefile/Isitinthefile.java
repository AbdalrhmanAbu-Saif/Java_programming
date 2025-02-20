package JavaProgramming1.Part4.FilesAndReadingData.Isitinthefile;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Isitinthefile {
    public  static void main(String[] args ){


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
        System.out.println("Search for:");
        while (true){

            Scanner name= new Scanner(System.in);
            String str1= name.nextLine();
            if (str1.isEmpty())
                break;
            else{
                if(names.contains(str1))
                    System.out.println("found");
                else
                    System.out.println("Not found.");
            }
        }


    }
}
