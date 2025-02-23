package JavaProgramming1.Part7.LargerProgrammingExercises.BigYear;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainBird {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Bird> birds = new ArrayList<>();

        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine().trim();

            if (command.equalsIgnoreCase("Quit")) {
                break;
            } else if (command.equalsIgnoreCase("Add")) {
                handleAddCommand(scanner, birds);
            } else if (command.equalsIgnoreCase("Observation")) {
                handleObservationCommand(scanner, birds);
            } else if (command.equalsIgnoreCase("All")) {
                handleAllCommand(birds);
            } else if (command.equalsIgnoreCase("One")) {
                handleOneCommand(scanner, birds);
            } else {
                System.out.println("Unknown command");
            }
        }
        scanner.close();
    }

    private static void handleAddCommand(Scanner scanner, List<Bird> birds) {
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Name in Latin: ");
        String latin = scanner.nextLine().trim();
        if (name.isEmpty() || latin.isEmpty()) {
            System.out.println("Error: Name and Latin name must be provided.");
        } else {
            birds.add(new Bird(name, latin));
        }
    }

    private static void handleObservationCommand(Scanner scanner, List<Bird> birds) {
        System.out.print("Bird? ");
        String birdName = scanner.nextLine().trim();
        boolean found = false;
        for (Bird bird : birds) {
            if (bird.getName().equals(birdName)) {
                bird.addObservation();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Not a bird!");
        }
    }

    private static void handleAllCommand(List<Bird> birds) {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }

    private static void handleOneCommand(Scanner scanner, List<Bird> birds) {
        System.out.print("Bird? ");
        String query = scanner.nextLine().trim();
        for (Bird bird : birds) {
            if (bird.getName().equals(query)) {
                System.out.println(bird);
            }
        }
    }
}
