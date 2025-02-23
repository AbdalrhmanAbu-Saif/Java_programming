package JavaProgramming1.Part1.ReadingInput;
import java.util.Scanner;
public class Message {

    public  static  void main(String[] args){
        System.out.println("Write a message: ");
        Scanner scanner =new Scanner(System.in);

        String message = scanner.nextLine();

        System.out.println(message);
    }
}
