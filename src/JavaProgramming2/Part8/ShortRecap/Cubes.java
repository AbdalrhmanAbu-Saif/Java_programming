package JavaProgramming2.Part8.ShortRecap;

import java.util.Scanner;

public class Cubes {
    public static void main(String[] args){
        while (true){
            Scanner str=new Scanner(System.in);
            String string= str.nextLine();
            if(string.equals("end"))
                break;
            int n= Integer.valueOf(string);
            System.out.println((int)Math.pow(n,3));
        }
    }
}
