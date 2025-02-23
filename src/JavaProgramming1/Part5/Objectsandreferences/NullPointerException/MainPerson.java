package JavaProgramming1.Part5.Objectsandreferences.NullPointerException;

public class MainPerson {
    public static void main(String[]args){
        Person joan = new Person("Joan Ball");
        System.out.println(joan);

        joan = null;
        joan.growOlder();
    }
}
