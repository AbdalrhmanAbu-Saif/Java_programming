package JavaProgramming1.Part4.SportStatistics;

public class SportStatistics {
    private String homeTeam;
    private String awayTeam;
    private int homePoints;
    private int awayPoints;

    public SportStatistics(String homeTeam, String awayTeam, int homePoints, int awayPoints) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homePoints = homePoints;
        this.awayPoints = awayPoints;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public int getHomePoints() {
        return homePoints;
    }

    public int getAwayPoints() {
        return awayPoints;
    }
}
