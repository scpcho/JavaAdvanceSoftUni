package FunctionalProgrammingLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> uppercaseWords =  Arrays.stream(scan.nextLine().split("\\s+"))
                .filter(FunctionalProgrammingLab.MyStrings.startsWithUppercase)
                .collect(Collectors.toList());

        System.out.println(uppercaseWords.size());
        System.out.println(uppercaseWords.stream().collect(Collectors.joining(System.lineSeparator())));


    }
}