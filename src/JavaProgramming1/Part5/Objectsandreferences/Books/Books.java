package JavaProgramming1.Part5.Objectsandreferences.Books;

import java.util.ArrayList;
import java.util.Scanner;

public class Books {
    static class Book {

        String name;
    String year;

    Book(String name, String year) {
        this.name = name;
        this.year = year;
    }

    // Checks if two books are the same by name and year
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return name.equals(book.name) && year.equals(book.year);
    }
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Book> books = new ArrayList<>();

    while (true) {
        System.out.print("Name (empty will stop): ");
        String name = scanner.nextLine();
        if (name.isEmpty()) {
            break;
        }

        System.out.print("Publication year: ");
        String year = scanner.nextLine();

        Book newBook = new Book(name, year);

        if (books.contains(newBook)) {
            System.out.println("The book is already on the list. Let's not add the same book again.");
        } else {
            books.add(newBook);
        }
    }

    System.out.println("\nThank you! Books added: " + books.size());
    scanner.close();
}
}
