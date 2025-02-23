package JavaProgramming1.Part4.IntrotoOOP.Whistle;

public class Whistles {
    private String sound;

    public Whistles(String whistleSound){
        this.sound=whistleSound;
    }
    public void sound(){
        System.out.println(this.sound);
    }
}
