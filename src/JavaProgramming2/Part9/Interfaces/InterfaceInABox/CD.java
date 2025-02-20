package JavaProgramming2.Part9.Interfaces.InterfaceInABox;

public class CD implements  Packable{

    private String artist;
    private String nameOfTheCD;
    private int publicationYear;
    private  double weightOfAllCDs;
    private  static final  double cdWeight=0.1;

    public CD(String artist, String nameOfTheCD, int publicationYear) {
        this.artist = artist;
        this.nameOfTheCD = nameOfTheCD;
        this.publicationYear = publicationYear;

    }

    @Override
    public double weight() {
        return cdWeight;
    }

    @Override
    public String toString() {
        return artist +": " +nameOfTheCD +" (" +publicationYear +")";

    }
}
