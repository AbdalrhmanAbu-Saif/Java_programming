package JavaProgramming2.Part9.Interfaces.TacoBoxes;

public class Main {
    public static void main(String[] args) {
        TacoBox tripleBox = new TripleTacoBox();
        System.out.println("TripleTacoBox tacos remaining: " + tripleBox.tacosRemaining());
        tripleBox.eat();
        System.out.println("After eating one taco: " + tripleBox.tacosRemaining());
        tripleBox.eat();
        tripleBox.eat();
        System.out.println("After eating two more tacos: " + tripleBox.tacosRemaining());
        tripleBox.eat(); // Should not go below 0
        System.out.println("Trying to eat when no tacos left: " + tripleBox.tacosRemaining());

        // Test CustomTacoBox
        TacoBox customBox = new CustomTacoBox(5);
        System.out.println("\nCustomTacoBox tacos remaining: " + customBox.tacosRemaining());
        customBox.eat();
        customBox.eat();
        System.out.println("After eating two tacos: " + customBox.tacosRemaining());
        customBox.eat();
        customBox.eat();
        customBox.eat();
        System.out.println("After eating three more tacos: " + customBox.tacosRemaining());
        customBox.eat(); // Should not go below 0
        System.out.println("Trying to eat when no tacos left: " + customBox.tacosRemaining());
    }
}
