package JavaProgramming1.Part4.ObjectsInaList;

import java.util.ArrayList;

public class Items {

    private String name;
    private int quantity;
    private double price;
    public Items(){
        this.name = "";
        this.quantity=0;
        this.price=0;
    }

    public Items(String name) {
        this.name = name;
        this.quantity=0;
        this.price=0;


    }

    public String getName() {
        return this.name;
    }

    public int getQuantity() {
        return this.quantity;
    }



    public void setPrice(int newPrice) {
        this.price= newPrice;
    }

    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }


    @Override
    public String toString() {
        return this.name + ", price " + this.price + " quantity "+this.quantity;
    }
}
