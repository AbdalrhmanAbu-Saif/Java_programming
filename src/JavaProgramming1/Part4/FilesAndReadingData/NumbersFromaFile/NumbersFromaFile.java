package JavaProgramming1.Part4.FilesAndReadingData.NumbersFromaFile;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromaFile {
    public  static void main(String[] args ){

        int  counter=0;
        ArrayList<Integer> number= new ArrayList<>();
        System.out.print("File?");
        Scanner string= new Scanner(System.in);
        String str = string.nextLine();

        if(str.equals("numbers-1.txt")) {
            try (Scanner scanner = new Scanner(Paths.get("/home/trainee1/source/lit-2410/Java Prgramming/src/JavaProgramming1/Part4/FilesAndReadingData/NumbersFromaFile/numbers-1.txt"))) {

                // we read all the lines of the file
                while (scanner.hasNextLine()) {
                    number.add(Integer.valueOf(scanner.nextLine()));
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        else  if(str.equals("numbers-2.txt")) {
            try (Scanner scanner = new Scanner(Paths.get("/home/trainee1/source/lit-2410/Java Prgramming/src/JavaProgramming1/Part4/FilesAndReadingData/NumbersFromaFile/numbers-2.txt"))) {

                // we read all the lines of the file
                while (scanner.hasNextLine()) {
                    number.add(Integer.valueOf(scanner.nextLine()));
                }

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        System.out.print("Lower bound?");
        Scanner num1 =new Scanner(System.in);
        int lower = num1.nextInt();

        System.out.print("Upper bound?");
        Scanner num2 =new Scanner(System.in);
        int upper = num2.nextInt();

        for(int n :number){
            if(n>=lower && n<=upper)
                counter++;
        }
        System.out.println("Numbers: "+counter);


    }
}
