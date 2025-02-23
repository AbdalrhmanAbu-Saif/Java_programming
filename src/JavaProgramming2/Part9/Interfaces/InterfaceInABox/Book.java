package JavaProgramming2.Part9.Interfaces.InterfaceInABox;

public class Book implements Packable{
    private String authorName;
    private String nameOfTheBk;
    private double weight;

    public Book(String authorName, String nameOfTheBk, double weight) {
        this.authorName = authorName;
        this.nameOfTheBk = nameOfTheBk;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return authorName +": "+ nameOfTheBk ;

    }

    @Override
    public double weight() {
        return this.weight;
    }
}
