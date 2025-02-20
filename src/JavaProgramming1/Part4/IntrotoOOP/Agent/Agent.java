package JavaProgramming1.Part4.IntrotoOOP.Agent;

public class Agent {
    private  String firstName;
    private  String lastName;

    public Agent(String firstName,String lastName ){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public void print() {
        System.out.println("My name is "+this.lastName+", "+this.firstName+" "+lastName);
    }

}
