package JavaProgramming2.Part8.SimilarityOfObjects.SameDate;

import JavaProgramming1.Part5.Objectsandreferences.DatingApp.SimpleDate;

public class SameDate {
    private int day;
    private int month;
    private int year;

   /* public SameDate(SameDate d){
        this.day=d.day;
        this.month=d.month;
        this.year=d.year;
    }*/

    public SameDate(int d,int m, int y){
        this.day=d;
        this.month=m;
        this.year=y;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    @Override
    public boolean equals(Object object){

        if (this == object) {
            return true;
        }
        if (!(object instanceof SimpleDate)) {
            return false;
        }
        SameDate d = (SameDate) object;
        return this.day == d.day && this.month == d.month && this.year == d.year;
    }
    @Override
    public int hashCode(){
       return (this.day+this.month*30+360*this.year)%(360);
    }
}
