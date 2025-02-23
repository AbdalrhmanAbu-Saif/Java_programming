package JavaProgramming2.Part8.HashMap.PrintMeMyHashMap;

import java.util.HashMap;

import static JavaProgramming2.Part8.HashMap.PrintMeMyHashMap.Program.*;

public class MainPrgram {
    public static void main(String[] args){

        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }
}
