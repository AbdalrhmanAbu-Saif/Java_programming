package JavaProgramming1.Part5.LearningOOP.Fitbyte;

public class Fitbyte {

    private int age;
    private int restingHeartRate;
    public Fitbyte(int age, int restingHeartRate){
        this.age=age;
        this.restingHeartRate=restingHeartRate;
    }
    public double targetHeartRate(double percentageOfMaximum){
        double maxHartRate = 206.3 - (0.711 * age);
        return (maxHartRate - this.restingHeartRate) * (percentageOfMaximum )+ this.restingHeartRate;
    }
}

