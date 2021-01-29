import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> parking = new LinkedHashSet<>();
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String registration = input.substring(input.indexOf(", ") + 1);
            if (input.contains("IN")) {
                parking.add(registration);
            } else {
                parking.remove(registration);
            }
            input = scanner.nextLine();
        }

        String output;
        if (!parking.isEmpty()) {
            output = parking.stream().collect(Collectors.joining(System.lineSeparator()));
        } else {
            output = "Parking Lot is Empty";
        }


        System.out.println(output);
    }
}
