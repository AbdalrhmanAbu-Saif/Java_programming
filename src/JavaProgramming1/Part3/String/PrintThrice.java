package JavaProgramming1.Part3.String;
import java.util.Scanner;
public class PrintThrice {
    public static  void main( String[] args) {

        System.out.print("Give  a word: ");

        Scanner s1= new Scanner(System.in);
        String str= s1.nextLine();

        String thrice =str+str+str;

        System.out.println(thrice);

    }



}
