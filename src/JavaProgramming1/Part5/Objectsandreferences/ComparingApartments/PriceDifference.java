package JavaProgramming1.Part5.Objectsandreferences.ComparingApartments;

public class PriceDifference {
    public static void  main(String[] args){
        Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
        Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
        Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);

        System.out.println(manhattanStudioApt.priceDifference(atlantaTwoBedroomApt));  //71600
        System.out.println(bangorThreeBedroomApt.priceDifference(atlantaTwoBedroomApt));   //35400
    }
}
