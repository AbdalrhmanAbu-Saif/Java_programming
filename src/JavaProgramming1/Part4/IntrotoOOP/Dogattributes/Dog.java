package JavaProgramming1.Part4.IntrotoOOP.Dogattributes;

public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog(String dogName ,String dogBreed,int dogAge){
        this.name=dogName;
        this.breed=dogBreed;
        this.age=dogAge;
    }

    public void PrintInfo(){
        System.out.println("Dog Name: "+this.name+"\n"+
                "Dog breed: "+this.breed+"\n"+
                "Dog age: "+age);
    }
}
