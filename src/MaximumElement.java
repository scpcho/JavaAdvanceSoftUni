import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersOfCommands = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> numbersOfStacks = new ArrayDeque<>();

        for (int i = 0; i < numbersOfCommands; i++) {
            int[] line = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

            switch (line[0]) {
                case 1:
                    int number = line[1];
                    numbersOfStacks.push(number);
                    break;
                case 2:
                    if (!numbersOfStacks.isEmpty()) {
                        numbersOfStacks.pop();
                    break;
                    }
                case 3:
                    int maxNumber = Collections.max(numbersOfStacks);
                    System.out.println(maxNumber);
                    break;
            }
        }
    }
}
