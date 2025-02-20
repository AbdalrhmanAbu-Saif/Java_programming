package JavaProgramming1.Part7.LargerProgrammingExercises.RecipeSearch;

import java.nio.file.Paths;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadingandListingRecipes {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("File to read: ");
            String filename = scanner.nextLine();

            AbstractList<Recipe> recipes = new ArrayList<>();
            try (Scanner fileScanner = new Scanner(Paths.get("/home/trainee1/source/lit-2410/Java Prgramming/src/JavaProgramming1/Part7/LargerProgrammingExercises/RecipeSearch/recipes.txt"))) {
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine().trim();
                    if (line.isEmpty()) {
                        continue;
                    }
                    String[] parts = line.split(",");
                    if (parts.length != 2) {
                        continue;
                    }
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
                } else {
                    System.out.println("Unknown command");
                }
            }

        }
}

