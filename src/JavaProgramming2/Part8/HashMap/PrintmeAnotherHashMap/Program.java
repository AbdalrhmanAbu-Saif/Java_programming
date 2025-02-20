package JavaProgramming2.Part8.HashMap.PrintmeAnotherHashMap;

import java.util.HashMap;

public class Program {
    private  HashMap<String, Book> program;

    public Program(){
        program=new HashMap<>();
    }
    public static void printKeys(HashMap<String,String> hashmap){
        for(String key :hashmap.keySet()){
            System.out.println(key);
        }
    }

    public static void printKeysWhere(HashMap<String,String> hashmap, String text){
      for(String key :hashmap.keySet()){
            if(key.contains(text))
                System.out.println(key);
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(hashmap.get(key));
            }
        }
    }
    public static void printValues(HashMap<String,Book> hashmap){
        for (String key : hashmap.keySet()){
            System.out.println(hashmap);
        }
    }
    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text){
        for (Book book : hashmap.values()) {
            if (book.getName().contains(text)) {
                System.out.println(book);
            }
        }
    }
}
