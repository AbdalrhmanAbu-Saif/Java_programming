package JavaProgramming1.Part4.IntrotoOOP.Paymentcard;

public class Toppingupthecardwithanegativevalue {
    public static void main(String[] args) {
        PaymentCard card = new PaymentCard(10);
        System.out.println("Paul: " + card);
        card.addMoney(-15);
        System.out.println("Paul: " + card);
    }
}
