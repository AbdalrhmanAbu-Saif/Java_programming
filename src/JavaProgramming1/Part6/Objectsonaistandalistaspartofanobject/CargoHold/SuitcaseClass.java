package JavaProgramming1.Part6.Objectsonaistandalistaspartofanobject.CargoHold;

import java.util.ArrayList;

public class SuitcaseClass {

    private ArrayList<Item> items;
    private int maxWeight;
    private int currentTotalWeight;

    public SuitcaseClass(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
        this.currentTotalWeight = 0;
    }
    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }

        Item heaviest = items.get(0);
        for (Item item : items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }

    public void addItem(Item item) {
        if (currentTotalWeight + item.getWeight() <= maxWeight) {
            items.add(item);
            currentTotalWeight += item.getWeight();
        }
    }
    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }


    public int totalWeight() {
        return currentTotalWeight;
    }

    @Override
    public String toString() {

            int itemCount = items.size();
            if (itemCount == 0) {
                return "no items (0 kg)";
            } else {
                String itemText = itemCount == 1 ? "item" : "items";
                return itemCount + " " + itemText + " (" + currentTotalWeight + " kg)";
            }
    }
}
