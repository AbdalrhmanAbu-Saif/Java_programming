package JavaProgramming1.Part4.ObjectsInaList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
public class MainBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());
            System.out.print("Publication year: ");
            int year = Integer.parseInt(scanner.nextLine());
            books.add(new Book(title, pages, year));
        }

        System.out.print("What information will be printed? ");
        String command = scanner.nextLine();

        for (Book book : books) {
            if (command.equals("everything")) {
                System.out.println(book.getTitle() + ", " + book.getPages() + " pages, " + book.getPublicationYear());
            } else if (command.equals("name")) {
                System.out.println(book.getTitle());
            }
        }
    }
}
*/
