package JavaProgramming1.Part4.ObjectsInaList;

import java.util.ArrayList;
import java.util.Scanner;

public class MainItem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Items i=new Items();
        ArrayList<Items> items = new ArrayList<>();

        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            items.add(new Items(name));
        }

        for (Items item : items) {
            System.out.println(item);
        }
    }
}
