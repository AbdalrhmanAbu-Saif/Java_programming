package JavaProgramming1.Part4.FilesAndReadingData;

import java.util.Scanner;

public class NumberofStrings {
    public static void main(String[] args){
        int count=0;
        Scanner string =new Scanner(System.in);
        while (true){

            String str=string.nextLine();
            if(str.equals("end"))
                break;
            count++;
        }
        System.out.println(count);
    }
}
