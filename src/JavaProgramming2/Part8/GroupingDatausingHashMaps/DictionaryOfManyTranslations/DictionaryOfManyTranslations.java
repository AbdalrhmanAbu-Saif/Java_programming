package JavaProgramming2.Part8.GroupingDatausingHashMaps.DictionaryOfManyTranslations;

import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {

        dictionary.putIfAbsent(word, new ArrayList<>());
        ArrayList<String> translations = this.dictionary.get(word);
        translations.add(translation);
    }

    public ArrayList<String> translate(String word) {
        for (String key : dictionary.keySet()) {
            if (dictionary.keySet().contains(word)) {
                return this.dictionary.get(word);
            }
            }
        return null;
        }


    public void remove(String word) {
        this.dictionary.remove(word);
    }

}
