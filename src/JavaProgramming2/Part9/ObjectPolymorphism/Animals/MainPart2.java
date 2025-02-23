package JavaProgramming2.Part9.ObjectPolymorphism.Animals;

public class MainPart2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.eat();

        Dog fido = new Dog("Fido");
        fido.bark();
    }
}
