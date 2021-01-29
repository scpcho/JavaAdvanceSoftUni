import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> vip = new LinkedHashSet<>();
        Set<String> regular = new LinkedHashSet<>();

        String guestName = scanner.nextLine();

        while (!guestName.equalsIgnoreCase("party")) {
            if (Character.isDigit(guestName.charAt(0))) {
                vip.add(guestName);
            } else {
                regular.add(guestName);
            }

            guestName = scanner.nextLine();
        }

        guestName = scanner.nextLine();
        while (!guestName.equalsIgnoreCase("end")) {

            if (Character.isDigit(guestName.charAt(0))) {
                vip.remove(guestName);
            } else {
                regular.remove(guestName);
            }
            guestName = scanner.nextLine();
        }
        System.out.println(vip.size() + regular.size());
        System.out.println(vip.stream().collect(Collectors.joining(System.lineSeparator())));
        System.out.println(regular.stream().collect(Collectors.joining(System.lineSeparator())));
    }
}