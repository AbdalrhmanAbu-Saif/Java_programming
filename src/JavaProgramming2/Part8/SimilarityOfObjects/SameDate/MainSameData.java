package JavaProgramming2.Part8.SimilarityOfObjects.SameDate;

import JavaProgramming1.Part5.Objectsandreferences.DatingApp.SimpleDate;

public class MainSameData {
    public static void main(String[] args){
     /*   SimpleDate d = new SimpleDate(1, 2, 2000);

       System.out.println(d.equals("heh"));

        System.out.println(d.equals(new SimpleDate(5, 2, 2012)));
        System.out.println(d.equals(new SimpleDate(1, 2, 2000)));
    */
        SameDate date1 = new SameDate(15, 2, 2025);
        SameDate date2 = new SameDate(15, 2, 2025);
        SameDate date3 = new SameDate(16, 2, 2025);

        System.out.println(date1.equals(date2)); // true
        System.out.println(date1.equals(date3)); // false
       // System.out.println(date1.equals("Some String")); // false

    }
}
