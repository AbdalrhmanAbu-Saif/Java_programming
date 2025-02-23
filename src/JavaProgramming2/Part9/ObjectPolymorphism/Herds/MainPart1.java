package JavaProgramming2.Part9.ObjectPolymorphism.Herds;

public class MainPart1 {
    public static void main(String[] args) {
        Organism organism = new Organism(20, 30);
        System.out.println(organism);
        organism.move(-10, 5);
        System.out.println(organism);
        organism.move(50, 20);
        System.out.println(organism);
    }
}
