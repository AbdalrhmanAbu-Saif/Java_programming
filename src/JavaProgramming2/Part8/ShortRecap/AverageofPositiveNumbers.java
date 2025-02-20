package JavaProgramming2.Part8.ShortRecap;

import java.util.Scanner;

public class AverageofPositiveNumbers {
    public static void main(String[] args){
        int sum=0,count=0;
        while (true){
            Scanner num=new Scanner(System.in);
            int number= num.nextInt();
            if(number==0)
                break;
            if(number>0){
            sum+=number;
            count++;
            }
        }
        if (count==0)
            System.out.println("Cannot calculate the average");

        System.out.println((sum/(count*1.0)));
    }
}
