package JavaProgramming1.Part6.SeparatingtheUI.SimpleDictionary;

import java.util.HashMap;

public class SimpleDictionary {

    private HashMap<String, String> dictionary;

    public SimpleDictionary() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        dictionary.put(word, translation);
    }

    public String translate(String word) {
        return dictionary.get(word);
    }
}
