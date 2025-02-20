package JavaProgramming1.Part5.Objectsandreferences.Money;

public class Money {
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;

        // Handle overflow of cents to euros
        if (newCents >= 100) {
            newEuros += newCents / 100;
            newCents = newCents % 100;
        }
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }

    public boolean lessThan(Money compared){
        if (this.euros< compared.euros)
            return true;
        return false;
    }

    public Money minus(Money decreaser){
        int totalCentsThis = (this.euros * 100) + this.cents;
        int totalCentsDecreaser = (decreaser.euros * 100) + decreaser.cents;


        int totalCentsDifference = totalCentsThis - totalCentsDecreaser;


        if (totalCentsDifference < 0) {
            return new Money(0, 0);
        }


        int newEuros = totalCentsDifference / 100;
        int newCents = totalCentsDifference % 100;


        return new Money(newEuros, newCents);
    }
}
