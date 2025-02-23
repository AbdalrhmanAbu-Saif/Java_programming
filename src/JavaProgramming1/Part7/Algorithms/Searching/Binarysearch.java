package JavaProgramming1.Part7.Algorithms.Searching;

import java.util.ArrayList;

public class Binarysearch {

    public static int binarySearch(ArrayList<Book> books, int searchedId) {
        int begin = 0;
        int end = books.size() - 1;

        while (begin <= end) {
            int middle = (begin + end) / 2;
            Book currentBook = books.get(middle);
            int currentId = currentBook.getId();

            if (currentId == searchedId) {
                return middle;
            } else if (currentId < searchedId) {
                begin = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }


    class Book {
        private int id;

        public Book(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }
    }
}