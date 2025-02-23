package JavaProgramming1.Part3.String;

import java.util.Scanner;

public class Login {
    public static  void main( String[] args) {


        String A1,A2;
        String P1,P2;

        A1="alex";   P1="sunshine";
        A2="emma";        P2="haskell";
        System.out.print("Enter username: ");

        Scanner s1 = new Scanner(System.in);
        String str1 = s1.nextLine();

        System.out.print("Enter password: ");

        Scanner s2 = new Scanner(System.in);
        String str2 = s2.nextLine();


        if((str1.equals(A1)&&str2.equals(P1))||(str1.equals(A2) &&str2.equals(P2)) )
            System.out.println("You have successfully logged in!");
        else
            System.out.println("Incorrect username or password!");




    }
}
