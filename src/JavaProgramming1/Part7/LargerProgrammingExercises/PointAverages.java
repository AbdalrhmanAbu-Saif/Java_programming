package JavaProgramming1.Part7.LargerProgrammingExercises;

import java.util.Scanner;

public class PointAverages {
    public static void  main(String[] args){

        int sum=0,counter=0;
        System.out.println("Enter point totals, -1 stops:");
        while (true){
            Scanner num= new Scanner(System.in);
            int number  = num.nextInt();

            if(number==-1){
                break;
            }
            if (number>=0 && number<=100){
                sum+=number;
                counter++;
            }
        }

        System.out.println("Point average (all): "+(sum/(counter*1.0)));
    }
}
