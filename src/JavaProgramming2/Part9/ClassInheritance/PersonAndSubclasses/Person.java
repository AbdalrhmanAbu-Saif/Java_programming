package JavaProgramming2.Part9.ClassInheritance.PersonAndSubclasses;

import java.util.ArrayList;

public class Person {
    private String name;
    private  String Location ;

    public Person(String name, String location) {
        this.name = name;
        Location = location;

    }
    public static void printPersons(ArrayList<Person> persons){
        for (Person p :persons)
            System.out.println(p);
    }

    @Override
    public String toString() {
        return name + "\n  "+ Location ;
    }
}
