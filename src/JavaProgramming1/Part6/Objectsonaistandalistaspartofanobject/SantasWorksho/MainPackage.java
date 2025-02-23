package JavaProgramming1.Part6.Objectsonaistandalistaspartofanobject.SantasWorksho;

public class MainPackage {
    public static void main(String[] args) {
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);

        PackageClass gifts = new PackageClass();
        gifts.addGift(book);
        System.out.println(gifts.totalWeight());
    }
}
