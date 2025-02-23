package JavaProgramming1.Part3.Array;
import java.util.Scanner;
public class IndexWasNotFound {

    public static  void main( String[] args){

        int[]  number = new int[5];
        for(int i=0;i<5;i++){
            Scanner s1 = new Scanner(System.in);
            number[i]= s1.nextInt();
        }

        System.out.print("Search for? ");
        Scanner s1 = new Scanner(System.in);
        int ft= s1.nextInt(),i;

        boolean found= false;
        for( i=0; i<number.length;i++){
            if(ft==number[i]) {
                found = true;
                break;
            }
        }

        if(found)
            System.out.println(ft+" is found at index "+i);

        else
            System.out.println(ft+" is not found at index ");




    }
}
