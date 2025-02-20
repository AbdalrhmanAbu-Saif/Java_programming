package JavaProgramming1.Part5.Objectsandreferences.DatingApp;

public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }

        // if the years are the same, compare months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        // the years and the months are the same, compare days
        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }
    public void advance(){
        if(this.day<=30)
            this.day+=1;
        else {
            this.day = 1;
            this.month+=1;
            if (this.month<=12) {
                this.month += 1;
            }
            else {
                this.month=1;
                this.day=1;
                this.year+=1;
            }
        }
    }

    public void advance(int howManyDays){
        if(this.day<=30)
            this.day+=howManyDays;
        else {
            this.day = 1;
            this.month+=1;
            if (this.month<=12) {
                this.month += 1;
            }
            else {
                this.month=1;
                this.day=1;
                this.year+=1;
            }
        }
    }
    public SimpleDate afterNumberOfDays(int days) {
        int originalTotalDays = (this.year - 1) * 360 + (this.month - 1) * 30 + this.day;
        int newTotalDays = originalTotalDays + days;

        int newYear = (newTotalDays - 1) / 360 + 1;
        int remainingDays = (newTotalDays - 1) % 360 + 1;

        int newMonth = (remainingDays - 1) / 12 + 1;
        int newDay = (remainingDays - 1) % 30 + 1;

        return new SimpleDate(newDay, newMonth, newYear);
    }

}
