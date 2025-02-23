package JavaProgramming1.Part6.Objectsonaistandalistaspartofanobject.Menu;

import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    // Adds a meal to the menu, only if it's not already present
    public void addMeal(String meal) {
        if (!meals.contains(meal)) {
            meals.add(meal);
        }
    }

    // Prints all the meals in the menu
    public void printMeals() {
        for (String meal : meals) {
            System.out.println(meal);
        }
    }

    // Clears the menu by emptying the list
    public void clearMenu() {
        meals.clear();
    }

}
