package src.javaOOP.WorkingWithAbastractionEx.cardWithPower;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(new Card(Ranks.valueOf(scan.nextLine()),Suits.valueOf(scan.nextLine())));
    }
}
