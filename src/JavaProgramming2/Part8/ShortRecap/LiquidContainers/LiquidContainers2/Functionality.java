package JavaProgramming2.Part8.ShortRecap.LiquidContainers.LiquidContainers2;

import java.util.Scanner;

public class Functionality {
    public static void main(String[] args){
        FunctionalityClass l =new FunctionalityClass();

        while (true) {
            System.out.println("First: "+l.getFirst()+"/100");
            System.out.println("Second: "+l.getSecond()+"/100");
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")){
                l.addamount(amount);
            }
            else if(command.equals("move")){
                l.moveamount(amount);
            }
            else if(command.equals("remove")){
                l.removeamount(amount);
            } else if (command.equals("quit")) {
                break;

            }
        }

    }
}
