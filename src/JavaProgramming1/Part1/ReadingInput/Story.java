package JavaProgramming1.Part1.ReadingInput;

import java.util.Scanner;

public class Story {
    public static void main(String[] args) {
            System.out.println("I will tell you a story, but I need some information first.\n" +
                    "What is the main character called?");
            Scanner a5=new Scanner(System.in);
            String str5=a5.nextLine();

            System.out.println("What is their job?");
            Scanner a6=new Scanner(System.in);
            String str6=a6.nextLine();

            System.out.println("Here is the story:\n" +
                    "Once upon a time there was "+str5+", who was a "+ str6+".\n" +
                    "On the way to work,"+str5+" reflected on life.\n" +
                    "Perhaps "+str5+" will not be a "+str6+" forever.");

        }

}
