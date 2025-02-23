package JavaProgramming1.Part6.Objectsonaistandalistaspartofanobject.CargoHold;

public class MainAll {
    public static void main(String[] args) {

        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        SuitcaseClass suitcase = new SuitcaseClass(10);
        suitcase.addItem(book);
        suitcase.addItem(phone);
        suitcase.addItem(brick);

        System.out.println("The suitcase contains the following items:");
        suitcase.printItems();
        System.out.println("Total weight: " + suitcase.totalWeight() + " kg");

    }

    }

