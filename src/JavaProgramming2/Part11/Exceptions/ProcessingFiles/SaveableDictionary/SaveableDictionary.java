package JavaProgramming2.Part11.Exceptions.ProcessingFiles.SaveableDictionary;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;


public class SaveableDictionary {
    private HashMap<String,String> translations;
    private String file;

    public SaveableDictionary(){
        this.translations = new HashMap<>();
    }
    public void add(String words, String translation) {
        if (translations.containsKey(words)) {
            return;
        }
        translations.put(words, translation);
        translations.put(translation, words);
    }

    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }
    public String translate(String word){
        return  translations.get(word);
    }

    public void delete(String word){
        translations.containsKey(word);
    }

    public boolean load() {
        if (file == null) {
            return false;
        }

        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (line.isEmpty()) {
                    continue;
                }
                String[] parts = line.split(":", 2);
                if (parts.length != 2) {
                    continue;
                }
                String word = parts[0].trim();
                String translation = parts[1].trim();
                if (!word.isEmpty() && !translation.isEmpty()) {
                    add(word, translation);
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean save() {
        try (FileWriter writer = new FileWriter(file)) {
            for (Map.Entry<String, String> entry : translations.entrySet()) {
                writer.write(entry.getKey() + ":" + entry.getValue() + "\n");
            }
            return true;
        } catch (IOException e) {
            return false;
        }
    }

}
