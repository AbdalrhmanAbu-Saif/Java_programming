package JavaProgramming1.Part5.Removingrepetitivecode.ConstructorOverload;

public class MainProduct {
    public static void main(String[] args ){
        Product tapeMeasure = new Product("Tape measure");
        Product plaster = new Product("Plaster", "home improvement section");
        Product tyre = new Product("Tyre", 5);

        System.out.println(tapeMeasure);
        System.out.println(plaster);
        System.out.println(tyre);
    }
}
