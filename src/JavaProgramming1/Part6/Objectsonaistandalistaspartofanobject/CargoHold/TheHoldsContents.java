package JavaProgramming1.Part6.Objectsonaistandalistaspartofanobject.CargoHold;

public class TheHoldsContents {
    public static void main(String[] args) {
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);

        SuitcaseClass adasCase = new SuitcaseClass(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        SuitcaseClass pekkasCase = new SuitcaseClass(10);
        pekkasCase.addItem(brick);

        HoldClass hold = new HoldClass(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);

        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();
    }
}
