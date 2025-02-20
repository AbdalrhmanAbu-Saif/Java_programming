package JavaProgramming1.Part3.List;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> Number = new ArrayList<>();
        while (true) {
            Scanner s1 = new Scanner(System.in);
            int num1 = s1.nextInt();

            if (num1 < 0)
                break;
            Number.add(num1);
        }
        System.out.print("From where ?");
        Scanner s2 = new Scanner(System.in);
        int st = s2.nextInt();
        System.out.print("To where ?");
        Scanner s3 = new Scanner(System.in);
        int end = s3.nextInt();
        for (int i = st; i <= end; i++) {

            System.out.println(Number.get(i));
        }

    }
}