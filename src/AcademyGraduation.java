import java.util.*;
import java.util.stream.Collectors;

public class AcademyGraduation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(scan.nextLine());
        Map<String, List<Double>> graduationList = new TreeMap<>();

        for (int i = 0; i < numberOfStudents; i++) {
            String name = scan.nextLine();
            List<Double> scoreList = Arrays.stream(scan.nextLine().split("\\s+"))
                    .map(Double::parseDouble).collect(Collectors.toList());
            graduationList.put(name,scoreList);
        }
        graduationList.forEach((k, v) -> System.out.printf("%s is graduated with %s%n", k,
                getAverage(v)));
    }
    private static Double getAverage(List<Double> value) {
        double average = 0.0;
        for (Double aDouble : value) {
            average += aDouble;
        }
        return average / value.size();
    }
}

