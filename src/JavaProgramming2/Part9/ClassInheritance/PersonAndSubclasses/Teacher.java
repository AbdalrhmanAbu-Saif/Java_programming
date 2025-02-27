package JavaProgramming2.Part9.ClassInheritance.PersonAndSubclasses;

public class Teacher extends Person{
    private int salary;

    public Teacher(String name, String location, int salary) {
        super(name, location);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() +"\n   salary  "+this.salary+" euro/month";
    }
}
