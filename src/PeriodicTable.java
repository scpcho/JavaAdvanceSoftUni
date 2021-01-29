import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> elements = new TreeSet<>();
        Long n = scanner.nextLong();
        scanner.nextLine();

        for (Long i = 0L; i < n; i++ ) {
            String[] input = scanner.nextLine().split(" ");
            elements.addAll(Arrays.asList(input));
        }
        for (String element : elements) {
            System.out.print(element + " ");
        }
    }
}
