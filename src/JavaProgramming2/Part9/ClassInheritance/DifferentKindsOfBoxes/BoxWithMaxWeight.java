package JavaProgramming2.Part9.ClassInheritance.DifferentKindsOfBoxes;

import JavaProgramming1.Part6.Objectsonaistandalistaspartofanobject.CargoHold.Item;

import java.util.ArrayList;

public abstract class BoxWithMaxWeight extends Box {

    private int maxWeight;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        this.items = new ArrayList<>();
    }


    public void add(Item item) {
        int currentWeight = items.stream().mapToInt(Item::getWeight).sum();
        if (currentWeight + item.getWeight() <= maxWeight) {
            items.add(item);
        }
    }


    public boolean isInBox(Item item) {
        return items.contains(item);
    }

}

