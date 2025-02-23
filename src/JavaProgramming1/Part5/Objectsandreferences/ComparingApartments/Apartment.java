package JavaProgramming1.Part5.Objectsandreferences.ComparingApartments;

import JavaProgramming1.Part5.Objectsandreferences.Biggestpetshop.Main;

public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared){
        if(this.rooms>compared.rooms && this.squares>compared.squares)
            return true;
        return false;
    }
    public int priceDifference(Apartment compared){

        return (Math.abs((this.squares*this.pricePerSquare)-(compared.squares*compared.pricePerSquare)));
    }

    public boolean moreExpensiveThan(Apartment compared){
        int m1= this.squares*this.pricePerSquare;
        int m2=compared.squares*compared.pricePerSquare;
        if(m1>m2)
            return true;

        return false;
    }
}
