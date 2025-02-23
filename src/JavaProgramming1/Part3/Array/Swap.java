package JavaProgramming1.Part3.Array;
import java.util.Scanner;

public class Swap {
    public  static  void  main( String[] args) {

        int[]  number = new int[5];
        for(int i=0;i<5;i++){
            Scanner s1 = new Scanner(System.in);
            number[i]= s1.nextInt();
        }

        System.out.println("Give two indices to swap: ");
        Scanner s1 = new Scanner(System.in);
       int ft= s1.nextInt();


        Scanner s2 = new Scanner(System.in);
        int  end= s2.nextInt();


        int  tmp= number[ft];
        number[ft]=number[end];
        number[end]=tmp;

        System.out.println("after swap");
        for(int i=0;i<5;i++){
            System.out.println(number[i]);

        }

    }
}
