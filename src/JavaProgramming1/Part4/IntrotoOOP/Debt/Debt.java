package JavaProgramming1.Part4.IntrotoOOP.Debt;

public class Debt {

    private  double balance;
    public  double interestRate;
    public Debt(double initialBalance, double initialInterestRate){
        this.balance=initialBalance;
        this.interestRate=initialInterestRate;
    }
    public void printBalance(){
        System.out.println(this.balance);
    }

    public void waitOneYear(){
        this.balance*=this.interestRate;
    }
}
