package JavaProgramming2.Part9.ClassInheritance.Warehousing;

import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = history;
    }

    public void add(double status){
        history.add(status);
    }

    public void clear(){
        history.clear();
    }

    @Override
    public String toString() {
        return "ChangeHistory{" +
                "history=" + history +
                '}';
    }

    public double maxValue(){
        double mx= history.get(0);
        for (Double d : history){
            if(d<mx){
                mx=d;
            }
        }
        return mx;
    }

    public double minValue(){
        double mn= history.get(0);
        for (Double d : history){
            if(d<mn){
                mn=d;
            }
        }
        return mn;
    }

    public double average(){
        double sum=0 ,count=0;
        for (Double d : history){
            sum+=d;
            count++;
        }
        return sum/(count*1.0);
    }
}
