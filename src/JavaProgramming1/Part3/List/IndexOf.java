package JavaProgramming1.Part3.List;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {
    public static void main(String[] args) {
        ArrayList<Integer> Number = new ArrayList<>();

        while (true) {
            Scanner s1 = new Scanner(System.in);
            int num1 = s1.nextInt();

            if (num1 < 0)
                break;
            Number.add(num1);

        }

        System.out.print("Search for?");
        Scanner s2 = new Scanner(System.in);
        int num = s2.nextInt();
        int i;
        for (i = 0; i < Number.size(); i++) {
            if (num == Number.get(i))
                System.out.println(num + " is at  index " + i);
        }


    }
}