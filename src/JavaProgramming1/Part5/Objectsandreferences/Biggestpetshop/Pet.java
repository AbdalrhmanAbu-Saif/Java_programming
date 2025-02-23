package JavaProgramming1.Part5.Objectsandreferences.Biggestpetshop;

public class Pet {
    private String name;
    private String type;

    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName(){
        return this.name;
    }
    public String getType(){
        return this.type;

    }
}
