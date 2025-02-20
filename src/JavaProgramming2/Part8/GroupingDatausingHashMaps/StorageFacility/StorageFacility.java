package JavaProgramming2.Part8.GroupingDatausingHashMaps.StorageFacility;

import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    HashMap<String, ArrayList<String>> storgeFacility;

    public StorageFacility(){
        this.storgeFacility=new HashMap<>();
    }
    public void add(String unit, String item){

        storgeFacility.putIfAbsent(unit, new ArrayList<>());
        ArrayList<String> translations = this.storgeFacility.get(unit);
        translations.add(unit);
    }
    public ArrayList<String> contents(String storageUnit){
        return this.storgeFacility.getOrDefault(storageUnit, new ArrayList<>());

    }
}
