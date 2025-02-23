package JavaProgramming1.Part4.FilesAndReadingData;

import java.util.Scanner;

public class Cubes {
    public static void main(String[] args){

        Scanner string =new Scanner(System.in);
        while (true){

            String str=string.nextLine();
            if(str.equals("end"))
                break;
            int num=Integer.valueOf(str);

            System.out.println(Math.pow(num,3));

        }

    }
}
