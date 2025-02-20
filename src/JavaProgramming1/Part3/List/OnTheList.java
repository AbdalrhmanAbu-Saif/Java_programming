package JavaProgramming1.Part3.List;

import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {
    public  static  void  main( String[] args) {
        ArrayList<String> Name = new ArrayList<>();
        while (true) {
            Scanner s1 = new Scanner(System.in);
            String Str1 = s1.nextLine();
            if (Str1.isEmpty())
                break;

            Name.add(Str1);

        }
        boolean Found = false;
        System.out.print("Search for? ");
        Scanner s2 = new Scanner(System.in);
        String Str2 = s2.nextLine();
        for (int i = 0; i < Name.size(); i++) {
            if (Str2.equals(Name.get(i)))
                Found = true;

        }

        if (Found)
            System.out.println(Str2 + " was found!");
        else
            System.out.println(Str2 + " was not found!");

    }

}
