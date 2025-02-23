package JavaProgramming1.Part5.LearningOOP.OneMinute;

public class Timer {
    private  ClockHand hundredths;
    private  ClockHand second;

    public Timer(){
        this.hundredths =new ClockHand(100);
        this.second = new ClockHand(60);
    }
    public String toString(){
        return String.format("%02d:%02d",this.second.value(),this.hundredths.value());
    }
    public void advance(){
        this.hundredths.advance();
        if(this.hundredths.value()==0)
            this.second.advance();
    }


}
