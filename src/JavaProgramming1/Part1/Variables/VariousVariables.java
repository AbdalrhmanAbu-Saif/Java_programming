package JavaProgramming1.Part1.Variables;

import java.util.Scanner;

public class VariousVariables {

    public static void  main(String[] args){
        System.out.println("Chicken: ");
        Scanner chicken=new Scanner(System.in);
        int numchicken =chicken.nextInt();


        System.out.println("Bacon (kg):");
        Scanner Bacon=new Scanner(System.in);
        float numbacon =Bacon.nextFloat();

        System.out.println("Tractor:");
        Scanner Tractor=new Scanner(System.in);
        String tractor =Tractor.nextLine();

        System.out.println("And finally, a summary:");
        System.out.println(numchicken+"\n"+numbacon+"\n"+tractor);

    }
}
