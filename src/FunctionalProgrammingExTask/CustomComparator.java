package FunctionalProgrammingExTask;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Comparator<Integer> comparator = (number1, number2) -> {
            if (number1 % 2 == 0 && number2 % 2 != 0) {
                return -1;
            } else if (number1 % 2 != 0 && number2 % 2 ==0) {
                return 1;
            }
            return number1.compareTo(number2);
        };
        numbers.stream().sorted(comparator).forEach(e -> System.out.print(e + " "));
    }
}
