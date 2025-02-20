package JavaProgramming1.Part6.SeparatingtheUI.SimpleDictionary;

import java.util.Scanner;

public class Cleaningupthetranslation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();
        StartingandStoppingtheUI ui = new StartingandStoppingtheUI(scanner, dictionary);
        ui.start();
    }
}
