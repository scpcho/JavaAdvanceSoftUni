package src.ExceptionsAndErrorHandling.validPerson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        try {
            Person person = new Person(firstName, lastName, age);

        } catch (IllegalArgumentException exception) {
            System.out.println("Exception thrown: " + exception.getMessage());
        }
    }
}
