package JavaProgramming1.Part6.Objectsonaistandalistaspartofanobject.SantasWorksho;

import java.util.ArrayList;

public class PackageClass {

    private ArrayList<Gift> gifts = new ArrayList<>();

    public PackageClass() {
    }

    public void addGift(Gift gift) {
        gifts.add(gift);
    }

    public int totalWeight() {
        int total = 0;
        for (Gift gift : gifts) {
            total += gift.getWeight();
        }
        return total;
    }

}
