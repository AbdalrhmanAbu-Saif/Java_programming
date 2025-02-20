package JavaProgramming2.Part9.ClassInheritance.Warehousing;

public class Warehouse {
    private double capacity;
    private double balance;

    public Warehouse(double capacity){
        if(capacity<=0){
           capacity=0;
        } else {
            this.capacity=capacity;
        }
    }


    public double getBalance() {
        return balance;
    }

    public double getCapacity() {
        return capacity;
    }
    public double howMuchSpaceLeft(){
        return this.capacity-this.balance;
    }
    public void addToWarehouse(double amount){
        if(amount<0){
            return;
        }
        if (this.balance+amount>this.capacity){
            this.balance=this.capacity;
        } else {
            this.balance+=amount;
        }
    }
    public double takeFromWarehouse(double amount){
        if(amount<0){
            return -1 ;
        }
        if(amount >this.balance){
            double take =this.balance;
            this.balance =0;
            return take;
        } else {

            this.balance-=amount;
            return this.balance;
        }
    }



    @Override
    public String toString() {
        return"balance=" + this.balance +", space left"+ howMuchSpaceLeft();
    }
}
