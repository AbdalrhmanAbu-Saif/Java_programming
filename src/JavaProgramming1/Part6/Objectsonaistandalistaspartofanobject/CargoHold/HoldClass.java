package JavaProgramming1.Part6.Objectsonaistandalistaspartofanobject.CargoHold;

import java.util.ArrayList;

public class HoldClass {

    private ArrayList<SuitcaseClass> suitcases;
    private int maxWeight;

    public HoldClass(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(SuitcaseClass suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= maxWeight) {
            suitcases.add(suitcase);
        }
    }

    private int totalWeight() {
        int total = 0;
        for (SuitcaseClass suitcase : suitcases) {
            total += suitcase.totalWeight();
        }
        return total;
    }

    public void printItems() {
        for (SuitcaseClass suitcase : suitcases) {
            suitcase.printItems();
        }
    }

    @Override
    public String toString() {
        int suitcaseCount = suitcases.size();
        int total = totalWeight();
        return suitcaseCount + " suitcase" + (suitcaseCount != 1 ? "s" : "") + " (" + total + " kg)";
    }
}
