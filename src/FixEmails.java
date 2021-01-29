import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input;
        while (!"stop".equals(input = scan.nextLine())) {
            String email = scan.nextLine();
            if (!email.endsWith(".com") && !email.endsWith(".uk") && !email.endsWith(".us")) {
                System.out.printf("%s -> %s%n", input, email);
            }
        }
    }
}
