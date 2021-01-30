package FunctionalProgrammingExTask;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] number = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Function<int[], int []> addOne = arr -> Arrays.stream(arr).map(num -> num + 1).toArray();
        Function<int[], int []> multiplyByTwo = arr -> Arrays.stream(arr).map(num -> num * 2).toArray();
        Function<int[], int []> subtractOne = arr -> Arrays.stream(arr).map(num -> num - 1).toArray();

        Consumer<int []> printConsumer = arr -> Arrays.stream(arr).forEach(e -> System.out.print( e + " "));

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            switch (command) {
                case "add":
                    number = addOne.apply(number);
                    break;
                case "multiply":
                    number = multiplyByTwo.apply(number);
                    break;
                case "subtract":
                    number = subtractOne.apply(number);
                    break;
                case "print":
                    printConsumer.accept(number);
                    System.out.println();
                    break;
            }
            command = scanner.nextLine();
        }
    }
}
