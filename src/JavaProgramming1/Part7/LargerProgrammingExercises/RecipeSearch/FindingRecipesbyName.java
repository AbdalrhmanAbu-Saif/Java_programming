package JavaProgramming1.Part7.LargerProgrammingExercises.RecipeSearch;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class FindingRecipesbyName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read: ");
        String filename = scanner.nextLine();

        ArrayList<Recipe> recipes = new ArrayList<>();
        try (Scanner fileScanner = new Scanner(Paths.get(filename))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().trim();
                if (line.isEmpty()) continue;
                String[] parts = line.split(",");
                if (parts.length != 2) continue;
                String name = parts[0].trim();
                int cookingTime;
                try {
                    cookingTime = Integer.parseInt(parts[1].trim());
                } catch (NumberFormatException e) {
                    continue;
                }
                recipes.add(new Recipe(name, cookingTime));
            }
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        System.out.println("\nCommands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");

        while (true) {
            System.out.print("\nEnter command: ");
            String command = scanner.nextLine().trim();

            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                System.out.println("\nRecipes:");
                for (Recipe recipe : recipes) {
                    System.out.println(recipe);
                }
            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String searchWord = scanner.nextLine().trim();
                System.out.println("\nRecipes:");
                for (Recipe recipe : recipes) {
                    if (recipe.getName().contains(searchWord)) {
                        System.out.println(recipe);
                    }
                }
            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
