package JavaProgramming2.Part9.ObjectPolymorphism.Animals;

public class Cat extends Animal implements NoiseCapable {
    private String nameCat;



    public Cat(String name) {
        super(name);
    }
    public Cat(){

        super("Cat");

    }


    public void purr(){
        System.out.println(this.getName() +" purrs");

    }

    @Override
    public void makeNoise() {

        System.out.println(this.getName() +" purrs");
    }
}
