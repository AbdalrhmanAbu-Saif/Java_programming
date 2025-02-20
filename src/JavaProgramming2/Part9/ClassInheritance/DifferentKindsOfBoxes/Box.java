package JavaProgramming2.Part9.ClassInheritance.DifferentKindsOfBoxes;

import java.util.ArrayList;

public abstract class Box {

    public abstract void add(Item item);

    public void add(ArrayList<Item> items) {
        for (Item item : items) {
            this.add(item); // Calls the abstract add method for each item
        }
    }

    public abstract boolean isInBox(Item item);
}
