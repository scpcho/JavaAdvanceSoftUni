package src.ExceptionsAndErrorHandling.enterNumbers;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static boolean proceed = true;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String message = "Enter valid integers in range 1 < start < end < 100";
        System.out.println(message);

        while (proceed) {
            try {
                int start = Integer.parseInt(scanner.nextLine());
                int end = Integer.parseInt(scanner.nextLine());
                printNumber(start, end);
            }

            catch (NumberFormatException exception) {
                System.out.println(message);

            }
        }
    }

    private static void printNumber(int start, int end) {
        if (!(start < end) || !(start > 1) || !(end < 100)) {
            throw new NumberFormatException();
        }
        IntStream.rangeClosed(start, end).forEach(System.out::println);
        proceed = false;
    }
}
