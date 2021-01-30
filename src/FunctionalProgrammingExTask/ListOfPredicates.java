package FunctionalProgrammingExTask;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<Integer> numberSet = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toCollection(HashSet::new));
        Predicate<Integer> isDivisible = num -> {
            for (Integer divider : numberSet) {
                if (num % divider != 0) {
                    return false;
                }
            }
            return true;
        };
        for (int i = 1; i <= n; i++) {
            boolean res = isDivisible.test(i);
            if (res) {
                System.out.print(i + " ");
            }

        }
    }
}
