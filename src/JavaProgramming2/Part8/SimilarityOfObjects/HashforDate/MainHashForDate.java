package JavaProgramming2.Part8.SimilarityOfObjects.HashforDate;

import JavaProgramming2.Part8.SimilarityOfObjects.SameDate.SameDate;

public class MainHashForDate {
    public  static void main(String[] args){

        SameDate date1 = new SameDate(15, 2, 2025);
        SameDate date2 = new SameDate(15, 2, 2025);
        SameDate date3 = new SameDate(16, 2, 2025);

        // Test equals() method
        System.out.println(date1.equals(date2)); // true
        System.out.println(date1.equals(date3)); // false

        // Test hashCode() method
        System.out.println(date1.hashCode()); // Should be consistent with date2
        System.out.println(date2.hashCode()); // Should be same as date1
        System.out.println(date3.hashCode());
    }
}
