package JavaProgramming1.Part4.IntrotoOOP.Song;

public class MainSong {
    public static void main(String[] args){

        Song garden = new Song("In The Garden", 10910);
        System.out.println("The song " + garden.name() + " has a length of " + garden.length() + " seconds.");
    }
}
