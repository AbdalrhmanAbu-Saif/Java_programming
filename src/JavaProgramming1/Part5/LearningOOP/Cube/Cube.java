package JavaProgramming1.Part5.LearningOOP.Cube;

public class Cube {
    private int lenth;

    public  Cube(int edgeLength){
      this.lenth=edgeLength;
    }
    public int volume(){
        return (int) Math.pow(this.lenth,3);
    }

    public String toString(){
        return String.format("The length of the edge is %d and the volume %d",this.lenth,(int)Math.pow(this.lenth,3));

    }
}
