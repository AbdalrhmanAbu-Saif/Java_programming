package JavaProgramming2.Part9.Interfaces.OnlineShop;

public class MainPart6 {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.add("milk", 3);
        cart.add("buttermilk", 2);
        cart.add("cheese", 5);
        cart.add("computer", 899);

        System.out.println("Cart price: " + cart.price());
        cart.print();
    }
}
