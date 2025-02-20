package JavaProgramming1.Part2.MoreLoops;

import java.util.Scanner;

public class RepeatingBreakingandRememberingP5 {
    public static void main(String[] args) {
        System.out.println("Give a number: ");
        int sum=0,count=0,evcunt=0,oddcunt=0;
        double avg;
        while (true){
            Scanner num1 = new Scanner(System.in);
            int number1 = num1.nextInt();

            if(number1==-1)
                break;
            if(number1%2==0)
                evcunt++;
            else
                oddcunt++;
            sum+=number1;
            count++;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: "+sum);
        System.out.println("numbers: "+count);
        avg=sum/(count*1.0);
        System.out.println("Average :"+avg);
        System.out.println("Even: "+evcunt);
        System.out.println("Odd: "+oddcunt);
    }
}
