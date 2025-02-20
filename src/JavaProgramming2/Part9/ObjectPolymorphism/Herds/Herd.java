package JavaProgramming2.Part9.ObjectPolymorphism.Herds;

import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable{
    private List<Movable> herd;
    public Herd() {
        this.herd= new ArrayList<>();
    }

    public void addToHerd(Movable movable){
        this.herd.add(movable);
    }
    @Override
    public void move(int dx, int dy){
        for (Movable movable :herd){
            movable.move(dx,dy);
        }
    }
    @Override
    public String toString() {
        String result = "";
        for (Movable movable : herd) {
            result += movable.toString()+"\n" ;
        }
        return result;

    }



}
