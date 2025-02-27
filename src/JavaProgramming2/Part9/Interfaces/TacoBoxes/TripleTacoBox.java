package JavaProgramming2.Part9.Interfaces.TacoBoxes;

public class TripleTacoBox implements TacoBox{
    private int tacos;

    public TripleTacoBox() {
        this.tacos=3;
    }

    @Override
    public int tacosRemaining() {
        return this.tacos;
    }

    @Override
    public void eat() {
        if(this.tacos>0){
            this.tacos--;
        } else {
            this.tacos=0;
        }
    }
}
