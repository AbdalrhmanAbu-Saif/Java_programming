package JavaProgramming1.Part6.SeparatingtheUI.SimpleDictionary;

import java.util.Scanner;

public class StartingandStoppingtheUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public StartingandStoppingtheUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }


    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                dictionary.add(word, translation);
            } else if (command.equals("translate")) {
                System.out.print("Word to translate: ");
                String word = scanner.nextLine();
                String translation = dictionary.translate(word);
                if (translation == null) {
                    System.out.println("Word " + word + " was not found");
                } else {
                    System.out.println("Translation: " + translation);
                }
            } else {
                System.out.println("Unknown command");
            }
        }
    }

}
