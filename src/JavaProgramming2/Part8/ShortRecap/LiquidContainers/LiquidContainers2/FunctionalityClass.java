package JavaProgramming2.Part8.ShortRecap.LiquidContainers.LiquidContainers2;

public class FunctionalityClass {
    private int first;
    private int  second;

    public FunctionalityClass(){
        this.first=0;
        this.second=0;
    }

    public int getFirst(){
        return this.first;
    }
    public int getSecond(){
        return this.second;
    }
    public void addamount(int n){
        if(this.first+n<100 && n>=0)
            this.first+=n;
        else if(this.first+n>=100)
            this.first=100;
    }

    public  void moveamount(int n){
        if(n>0) {
            if (this.first != 0 && this.first > n) {
                this.second +=  n;
                this.first -= n;
            }
            else if (n > this.first && this.first != 0) {
                this.second = n - this.first;
                this.first = 0;
            }
        }
    }

    public void removeamount(int  n){
        if(this.second!=0 && n>0)
            this.second-=n;
        if(this.second-n<0)
            this.second=0;
    }

}
