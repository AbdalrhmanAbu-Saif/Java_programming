package JavaProgramming1.Part6.Objectsonaistandalistaspartofanobject.LongestinCollection;

import java.util.ArrayList;

public class LongestInCollection {
    private String name;
    private ArrayList<String> elements;

    public LongestInCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public String longest() {
        if (elements.isEmpty()) {
            return null;
        }

        String longest = elements.get(0);
        for (String element : elements) {
            if (element.length() > longest.length()) {
                longest = element;
            }
        }
        return longest;
    }
}
