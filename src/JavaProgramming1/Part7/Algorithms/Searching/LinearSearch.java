package JavaProgramming1.Part7.Algorithms.Searching;

import java.util.ArrayList;

public class LinearSearch {
    public static int linearsearch(ArrayList<Book> books, int searchedId) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getId() == searchedId) {
                return i;
            }
        }
        return -1;
    }
}

class Book {
    private int id;


    public int getId() {
        return id;
    }
}
