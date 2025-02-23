package JavaProgramming1.Part3.List;

import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> Number = new ArrayList<>();
        while (true) {
            Scanner s1 = new Scanner(System.in);
            int num1 = s1.nextInt();

            if (num1 < 0)
                break;
            Number.add(num1);
        }

        for (int i = 0; i < Number.size(); i++) {

            System.out.println(Number.get(i));
        }
    }
}