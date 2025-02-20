package JavaProgramming1.Part3.List;

import java.util.ArrayList;

public class IndexOutOfBoundsException {
    public  static  void  main( String[] args) {
        ArrayList<String> wordList = new ArrayList<>();

        wordList.add("First");
        wordList.add("Second");
        System.out.println(wordList.get(4));
    }
}
