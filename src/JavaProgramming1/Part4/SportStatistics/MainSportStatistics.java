package JavaProgramming1.Part4.SportStatistics;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class MainSportStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String filename = scanner.nextLine();

        ArrayList<SportStatistics> matches = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(Paths.get(filename))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().trim();
                if (line.isEmpty()) {
                    continue;
                }
                String[] parts = line.split(",");
                if (parts.length != 4) {
                    System.out.println("Invalid line: " + line);
                    continue;
                }
                try {
                    String home = parts[0].trim();
                    String away = parts[1].trim();
                    int homePoints = Integer.parseInt(parts[2].trim());
                    int awayPoints = Integer.parseInt(parts[3].trim());
                    matches.add(new SportStatistics(home, away, homePoints, awayPoints));
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number in line: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        System.out.println("Team:");
        String team = scanner.nextLine().trim();

        for (SportStatistics match : matches) {
            if (match.getHomeTeam().equals(team) || match.getAwayTeam().equals(team)) {
                System.out.println(match.getHomeTeam() + " vs " + match.getAwayTeam() + ": " +
                        match.getHomePoints() + "-" + match.getAwayPoints());
            }
        }
    }

    }

