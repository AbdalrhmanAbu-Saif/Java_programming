package JavaProgramming1.Part6.Objectsonaistandalistaspartofanobject.Menu;

public class ClearingtheFoodList {
    public static void main(String[] args){
        Menu menu = new Menu();
        menu.addMeal("Tofu ratatouille");
        menu.addMeal("Chilli Coconut Chicken");
        menu.addMeal("Chilli Coconut Chicken");
        menu.addMeal("Meatballs with mustard sauce");

        menu.printMeals();
        menu.clearMenu();

        System.out.println("*****");
        menu.addMeal("Tomato and mozzarella salad");
        menu.printMeals();
    }
}
