package JavaProgramming2.Part9.Interfaces.SetAsMethodParameter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetAsMethodParameter {

    public static int returnSize(Set<String> set) {
        return set.size();
    }

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("first");
        names.add("first");
        names.add("second");
        names.add("second");
        names.add("second");

        System.out.println(returnSize(names));
    }
}
