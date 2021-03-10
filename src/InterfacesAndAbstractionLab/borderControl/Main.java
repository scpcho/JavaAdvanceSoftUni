package src.InterfacesAndAbstractionLab.borderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Identifiable> ids = new ArrayList<>();
        String input;

        while (!"End".equals(input = scan.nextLine())) {
            String[] tokens = input.split("\\s+");
            ids.add(tokens.length == 3
                    ? new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2])
                    : new Robot(tokens[0], tokens[1]));
        }
        String fix = scan.nextLine();

        for (Identifiable id : ids) {
            System.out.printf("%s", id.getId().endsWith(fix) ? id.getId() + System.lineSeparator() : "");
        }
    }
}
