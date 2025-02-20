package JavaProgramming2.Part9.Interfaces.TacoBoxes;

import java.util.ArrayList;

public class Box implements  TacoBox {
    private  double  maxCapacity;

    public Box() {

    }

    @Override
    public int tacosRemaining() {
        return 0;
    }

    @Override
    public void eat() {

    }
}
