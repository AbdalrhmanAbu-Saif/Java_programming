package JavaProgramming1.Part7.LargerProgrammingExercises;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
public class Passpercentage {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<Integer> points = new ArrayList<>();

            System.out.println("Enter point totals, -1 stops:");
            while (true) {
                String input = scanner.nextLine();
                if (!input.matches("-?\\d+")) continue;
                int number = Integer.parseInt(input);

                if (number == -1) break;
                if (number >= 0 && number <= 100) {
                    points.add(number);
                }
            }


            double averageAll = 0.0;
            double averagePassing = 0.0;
            double passPercentage = 0.0;

            if (!points.isEmpty()) {

                int sumAll = 0;
                for (int p : points) {
                    sumAll += p;
                }
                averageAll = (double) sumAll / points.size();


                List<Integer> passing = new ArrayList<>();
                for (int p : points) {
                    if (p >= 50) {
                        passing.add(p);
                    }
                }


                if (!passing.isEmpty()) {
                    int sumPassing = 0;
                    for (int p : passing) {
                        sumPassing += p;
                    }
                    averagePassing = (double) sumPassing / passing.size();
                }


                passPercentage = 100.0 * passing.size() / points.size();
            }


            System.out.printf("Point average (all): %.1f%n", averageAll);
            if (points.isEmpty() || averagePassing == 0.0) {
                System.out.println("Point average (passing): -");
            } else {
                System.out.printf("Point average (passing): %.1f%n", averagePassing);
            }
            System.out.printf("Pass percentage: %.1f%n", passPercentage);
        }

}

