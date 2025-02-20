package JavaProgramming1.Part5.Objectsandreferences.Archive;

import java.util.ArrayList;
import java.util.Scanner;

public class MainItemP2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<ItemP2> items = new ArrayList<>();

        while (true) {
            System.out.print("Identifier? (empty will stop) ");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }

            System.out.print("Name? (empty will stop) ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            ItemP2 newItem = new ItemP2(identifier, name);

            // Check if the identifier already exists
            if (!items.contains(newItem)) {
                items.add(newItem);
            }
        }

        System.out.println("\n==Items==");
        for (ItemP2 item : items) {
            System.out.println(item);
        }

        scanner.close();
    }
}
