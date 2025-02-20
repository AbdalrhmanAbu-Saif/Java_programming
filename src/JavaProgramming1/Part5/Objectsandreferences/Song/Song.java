package JavaProgramming1.Part5.Objectsandreferences.Song;

public class Song {
    private String namesong;
    private String author;
    private int value;

    public Song(String a,String b, int c){
        this.namesong=a;
        this.author=b;
        this.value=c;
    }

    public boolean equals( Song s){
        if(this.namesong==s.namesong && this.author==s.author &&this.value==s.value)
            return true;

        return false;
    }
}
