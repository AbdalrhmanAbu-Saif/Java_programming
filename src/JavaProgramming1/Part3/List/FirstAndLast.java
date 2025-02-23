package JavaProgramming1.Part3.List;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {
    public  static  void  main( String[] args) {

        ArrayList<String> Names = new ArrayList<>();

        while (true) {
            Scanner s1 = new Scanner(System.in);
            String Str1 = s1.nextLine();
            if (Str1.isEmpty())
                break;

            Names.add(Str1);

        }
        int lst = Names.size() - 1;
        System.out.println(Names.get(0));
        System.out.println(Names.get(lst));

    }
}
