package src.javaOOP.WorkingWithAbastractionEx.cardSuit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(scan.nextLine()+":");
        for (Suits value : Suits.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n",value.ordinal(),value.name());
        }
    }
}