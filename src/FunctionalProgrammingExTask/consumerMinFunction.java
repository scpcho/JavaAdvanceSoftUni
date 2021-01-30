package FunctionalProgrammingExTask;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class consumerMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<int[], Integer> getMinElement = numbers -> Arrays.stream(numbers).min().getAsInt();
        int[] array = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int minElement = getMinElement.apply(array);
        System.out.println(minElement);
    }
}
