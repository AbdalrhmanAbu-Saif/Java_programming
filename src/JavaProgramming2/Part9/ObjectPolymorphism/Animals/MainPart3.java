package JavaProgramming2.Part9.ObjectPolymorphism.Animals;

public class MainPart3 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.purr();
        cat.eat();

        Cat garfield = new Cat("Garfield");
        garfield.purr();
    }
}
