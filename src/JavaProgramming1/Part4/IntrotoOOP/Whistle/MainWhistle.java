package JavaProgramming1.Part4.IntrotoOOP.Whistle;

public class MainWhistle {
    public static void main(String[] args){

        Whistles duckWhistle = new Whistles("Kvaak");
        Whistles roosterWhistle = new Whistles("Peef");

        duckWhistle.sound();
        roosterWhistle.sound();
        duckWhistle.sound();
    }
}
