package JavaProgramming1.Part6.SeparatingtheUI.SimpleDictionary;

import java.util.Scanner;

public class TranslatingaWord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();

        StartingandStoppingtheUI textUI = new StartingandStoppingtheUI(scanner, dictionary);
        textUI.start();
        System.out.println(dictionary.translate("pike")); // prints the string "hauki"
    }
}
