package JavaProgramming1.Part5.Objectsandreferences.Archive;

import JavaProgramming2.Part9.ClassInheritance.DifferentKindsOfBoxes.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class AddingandListingitems {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();

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

         //   items.add(new Item(identifier, name));
        }

        System.out.println("\n==Items==");
        for (Item item : items) {
            System.out.println(item);
        }

    }
}

