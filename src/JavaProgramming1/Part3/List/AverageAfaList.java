package JavaProgramming1.Part3.List;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageAfaList {
    public  static  void  main( String[] args) {

        ArrayList<Integer> Number = new ArrayList<>();
        int sum = 0;
        double avg;
        while (true) {
            Scanner s1 = new Scanner(System.in);
            int num1 = s1.nextInt();

            if (num1 < 0)
                break;
            Number.add(num1);
            sum += num1;
        }
        avg = (sum * 1.0) / (Number.size());
        System.out.println("Average: " + avg);
    }
}
