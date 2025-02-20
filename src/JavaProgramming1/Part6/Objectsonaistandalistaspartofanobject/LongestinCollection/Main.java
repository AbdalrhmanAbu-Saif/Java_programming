package JavaProgramming1.Part6.Objectsonaistandalistaspartofanobject.LongestinCollection;

public class Main {
    public  static void main(String[] args){
        LongestInCollection j = new LongestInCollection("characters");
        System.out.println("Longest: " + j.longest());

        j.add("magneto");
        j.add("mystique");
        j.add("phoenix");

        System.out.println("Longest: " + j.longest());
    }


}
