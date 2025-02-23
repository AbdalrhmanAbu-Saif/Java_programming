package JavaProgramming2.Part9.Interfaces.TacoBoxes;

public class CustomTacoBox  implements TacoBox{
    private int tacos;

    CustomTacoBox(int tacos){
        this.tacos=tacos;
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
