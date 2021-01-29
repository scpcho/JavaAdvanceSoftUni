package FunctionalProgrammingLabTasks;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Predicate<String> startsWithUppercase
                = str -> str != null
                && !str.isEmpty() && Character.isUpperCase(str.charAt(0));

        List<String> uppercaseWords =  Arrays.stream(scan.nextLine().split("\\s+"))
                .filter(startsWithUppercase)
                .collect(Collectors.toList());

        System.out.println(uppercaseWords.size());
        System.out.println(uppercaseWords.stream().collect(Collectors.joining(System.lineSeparator())));


    }
}