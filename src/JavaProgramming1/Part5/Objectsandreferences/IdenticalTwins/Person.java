package JavaProgramming1.Part5.Objectsandreferences.IdenticalTwins;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int weight;
    private int height;

    // Constructor
    public Person(String name, SimpleDate birthday, int weight, int height) {
        this.name = name;
        this.birthday = birthday;
        this.weight = weight;
        this.height = height;
    }

    // equals method
    @Override
    public boolean equals(Object compared) {
        // If the objects are the same, return true
        if (this == compared) {
            return true;
        }

        // If the compared object is not of type Person, return false
        if (!(compared instanceof Person)) {
            return false;
        }

        // Convert the compared object to a Person object
        Person comparedPerson = (Person) compared;

        // Compare the attributes of the persons
        return this.name.equals(comparedPerson.name) &&
                this.birthday.equals(comparedPerson.birthday) &&
                this.weight == comparedPerson.weight &&
                this.height == comparedPerson.height;
    }
}
