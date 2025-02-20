package JavaProgramming2.Part8.ShortRecap.LiquidContainers.LiquidContainers2;

public class Container {
    private int first;

    private int am;
    public Container(){
        this.first=0;
        this.am=0;
    }
    public int contains(){
        return this.am;
    }


    public void add(int amount){
        this.am=amount;
        if(this.first+amount<100 && amount>=0)
            this.first+=amount;
        else if(this.first+amount>=100)
            this.first=100;
    }
    public void remove(int amount) {
        if (amount > 0) {
            this.first-=amount;
        }
        if (amount>this.first)
            this.first=0;
    }
    public String toString(){
        return (this.first+"/100");
    }


}
