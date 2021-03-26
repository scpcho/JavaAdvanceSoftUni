package src.ExceptionsAndErrorHandling.squareRoot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println(Math.sqrt(Integer.parseInt(scanner.nextLine())));

        } catch (NumberFormatException exception) {
            System.out.println("Invalid input");

        } finally {
            System.out.println("Good bye");
        }
    }
}
