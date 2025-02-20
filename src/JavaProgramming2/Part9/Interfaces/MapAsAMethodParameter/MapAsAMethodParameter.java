package JavaProgramming2.Part9.Interfaces.MapAsAMethodParameter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapAsAMethodParameter {

    public static int returnSize(Map<String,String> map) {
        return map.size();
    }
    public static void main(String[] args) {

        Map<String, String> names = new HashMap<>();
        names.put("1", "first");
        names.put("2", "second");

        System.out.println(returnSize(names));
    }
}
