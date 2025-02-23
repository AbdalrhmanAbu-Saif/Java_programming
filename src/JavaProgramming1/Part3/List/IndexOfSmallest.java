package JavaProgramming1.Part3.List;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {
    public  static  void  main( String[] args) {
        ArrayList<Integer> Number= new ArrayList<>();
        ArrayList<Integer> index= new ArrayList<>();

        while (true) {
            Scanner s1 = new Scanner(System.in);
            int num1 = s1.nextInt();

            if (num1==9999)
                break;
            Number.add(num1);
        }

        int  small=Number.get(0);

        for (int i =0 ; i<Number.size();i++){
            if(Number.get(i)<small)
                small=Number.get(i);
        }

        System.out.println("Smallest number: "+small);
        for (int i =0 ; i<Number.size();i++) {

            if(Number.get(i)==small)
                System.out.println("Found at index: "+i);

        }
    }
}
