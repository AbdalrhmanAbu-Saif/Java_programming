package JavaProgramming2.Part9.ClassInheritance.PersonAndSubclasses;

public class StudentsToString {
    public static void main(String[] args) {
        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        ollie.study();
        System.out.println(ollie);

    }
}
