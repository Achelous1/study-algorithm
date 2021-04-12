import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // get test count
        int testCount = scanner.nextInt();
        
        // loop through test count
        for(int i = 0; i < testCount; i++){
            // get student count
            int studentCount = scanner.nextInt();
            Integer [] scores = new Integer[studentCount];
            // loop through student count
            for(int j = 0; j < studentCount; j++){
                scores[j] = scanner.nextInt();
            }
            // solve for average
            Double average = getAverage(scores);
            // print passing rate
            System.out.println(getPassers(average, scores));
        }

        
    }

    private static Double getAverage(Integer[] scores){
        Double average = 0.000;

        for(Integer score : scores){
            average += score;
        }

        average = average / scores.length;
        return average;
    }

    private static String getPassers(Double average, Integer[] scores){
        Double count = 0.000;

        for(Integer score : scores){
            if(score > average){
                count++;
            }
        }

        return String.format("%.3f%s", Double.valueOf(count / scores.length) * 100, "%");
    }
}
