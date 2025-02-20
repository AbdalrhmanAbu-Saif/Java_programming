package JavaProgramming2.Part9.ClassInheritance.PersonAndSubclasses;

import java.util.ArrayList;

import static JavaProgramming2.Part9.ClassInheritance.PersonAndSubclasses.Person.printPersons;

public class MainListAllPerson {

    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        printPersons(persons);
    }
}
