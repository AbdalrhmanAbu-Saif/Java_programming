package JavaProgramming2.Part9.Interfaces.OnlineShop;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> shopList;


    public ShoppingCart() {
        this.shopList = new HashMap<>();
    }
    public void add(String product, int price){
        if (shopList.containsKey(product)) {

            shopList.get(product).increaseQuantity();
        } else {

            shopList.put(product, new Item(product, 1, price));
        }
    }
    public int price(){
        int totalPrice=0;
        for (Item i :shopList.values()){
            totalPrice+=i.price();
        }
        return totalPrice;
    }

    public void print(){
        for (Item i :shopList.values()){
            System.out.println(i);
        }
    }

}
