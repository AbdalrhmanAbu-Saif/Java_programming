package JavaProgramming1.Part5.Objectsandreferences.CardPayments;

public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000.0;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment) {
        double mealcost=2.50;
        if(payment>=mealcost){
            this.money+=mealcost;
            this.affordableMeals++;
            return payment-mealcost;
        }
        else
            return payment;
    }

    public double eatHeartily(double payment) {
        double mealcost=4.30;
        if(payment>=mealcost){
            this.money+=mealcost;
            this.heartyMeals++;
            return payment-mealcost;
        }
        else
            return payment;

    }
    public boolean eatAffordably(PaymentCard card){
        double mealcost=2.50;
        if(card.takeMoney(mealcost)){
            this.affordableMeals++;
            return true;
        }
        else
            return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        double mealcost=4.30;
        if(card.takeMoney(mealcost)){
            this.heartyMeals++;
            return true;
        }
        else
            return false;
    }
    public void addMoneyToCard(PaymentCard card, double sum) {

        card.addMoney(sum);
    }



    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
