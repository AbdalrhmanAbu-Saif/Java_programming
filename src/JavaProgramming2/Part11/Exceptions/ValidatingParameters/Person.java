package JavaProgramming2.Part11.Exceptions.ValidatingParameters;

public class Person {
    private String name;
    private int  age ;

    public Person(String name, int age) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if (name.length() > 40) {
            throw new IllegalArgumentException("Name cannot exceed 40 characters");
        }
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age must be between 0 and 120");
        }
        this.name = name;
        this.age = age;
    }
}
