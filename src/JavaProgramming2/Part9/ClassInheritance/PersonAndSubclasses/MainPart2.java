package JavaProgramming2.Part9.ClassInheritance.PersonAndSubclasses;

public class MainPart2 {
    public static void main(String[] args){
        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        System.out.println("Study credits " + ollie.credits());
        ollie.study();
        System.out.println("Study credits "+ ollie.credits());
    }
}
